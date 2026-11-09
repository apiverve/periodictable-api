/// Response models for the Periodic Table API.

/// API Response wrapper.
class PeriodictableResponse {
  final String status;
  final dynamic error;
  final PeriodictableData? data;

  /// Set only when the current plan locks one or more fields; null otherwise.
  final PremiumInfo? premium;

  PeriodictableResponse({
    required this.status,
    this.error,
    this.data,
    this.premium,
  });

  factory PeriodictableResponse.fromJson(Map<String, dynamic> json) => PeriodictableResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? PeriodictableData.fromJson(json['data']) : null,
    premium: json['premium'] != null ? PremiumInfo.fromJson(json['premium']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
    if (premium != null) 'premium': premium!.toJson(),
  };
}

/// Describes fields the current plan does not unlock. Locked fields arrive as null
/// in [data], and [lockedFields] names them (nested ones use dot paths).
class PremiumInfo {
  final String? message;
  final String? upgradeUrl;
  final List<String>? lockedFields;

  PremiumInfo({this.message, this.upgradeUrl, this.lockedFields});

  factory PremiumInfo.fromJson(Map<String, dynamic> json) => PremiumInfo(
    message: json['message'] as String?,
    upgradeUrl: json['upgrade_url'] as String?,
    lockedFields: (json['locked_fields'] as List?)?.map((e) => e.toString()).toList(),
  );

  Map<String, dynamic> toJson() => {
    if (message != null) 'message': message,
    if (upgradeUrl != null) 'upgrade_url': upgradeUrl,
    if (lockedFields != null) 'locked_fields': lockedFields,
  };
}

/// Response data for the Periodic Table API.

class PeriodictableData {
  num? count;
  List<PeriodictableDataElementsItem>? elements;

  PeriodictableData({
    this.count,
    this.elements,
  });

  factory PeriodictableData.fromJson(Map<String, dynamic> json) => PeriodictableData(
      count: json['count'],
      elements: (json['elements'] as List?)?.map((e) => PeriodictableDataElementsItem.fromJson(e)).toList(),
    );
}

class PeriodictableDataElementsItem {
  String? name;
  String? appearance;
  num? atomicMass;
  num? boil;
  String? category;
  num? density;
  String? discoveredBy;
  num? melt;
  num? molarHeat;
  String? namedBy;
  num? number;
  num? period;
  num? group;
  String? phase;
  String? source;
  String? summary;
  String? symbol;
  num? xpos;
  num? ypos;
  num? wxpos;
  num? wypos;
  List<num>? shells;
  String? electronConfiguration;
  String? electronConfigurationSemantic;
  num? electronAffinity;
  num? electronegativityPauling;
  List<num>? ionizationEnergies;
  String? cpk-hex;
  String? block;

  PeriodictableDataElementsItem({
    this.name,
    this.appearance,
    this.atomicMass,
    this.boil,
    this.category,
    this.density,
    this.discoveredBy,
    this.melt,
    this.molarHeat,
    this.namedBy,
    this.number,
    this.period,
    this.group,
    this.phase,
    this.source,
    this.summary,
    this.symbol,
    this.xpos,
    this.ypos,
    this.wxpos,
    this.wypos,
    this.shells,
    this.electronConfiguration,
    this.electronConfigurationSemantic,
    this.electronAffinity,
    this.electronegativityPauling,
    this.ionizationEnergies,
    this.cpk-hex,
    this.block,
  });

  factory PeriodictableDataElementsItem.fromJson(Map<String, dynamic> json) => PeriodictableDataElementsItem(
      name: json['name'],
      appearance: json['appearance'],
      atomicMass: json['atomic_mass'],
      boil: json['boil'],
      category: json['category'],
      density: json['density'],
      discoveredBy: json['discovered_by'],
      melt: json['melt'],
      molarHeat: json['molar_heat'],
      namedBy: json['named_by'],
      number: json['number'],
      period: json['period'],
      group: json['group'],
      phase: json['phase'],
      source: json['source'],
      summary: json['summary'],
      symbol: json['symbol'],
      xpos: json['xpos'],
      ypos: json['ypos'],
      wxpos: json['wxpos'],
      wypos: json['wypos'],
      shells: (json['shells'] as List?)?.cast<num>(),
      electronConfiguration: json['electron_configuration'],
      electronConfigurationSemantic: json['electron_configuration_semantic'],
      electronAffinity: json['electron_affinity'],
      electronegativityPauling: json['electronegativity_pauling'],
      ionizationEnergies: (json['ionization_energies'] as List?)?.cast<num>(),
      cpk-hex: json['cpk-hex'],
      block: json['block'],
    );
}

class PeriodictableRequest {
  String name;

  PeriodictableRequest({
    required this.name,
  });

  Map<String, dynamic> toJson() => {
      'name': name,
    };
}
