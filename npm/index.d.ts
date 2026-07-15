declare module '@apiverve/periodictable' {
  export interface periodictableOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface periodictableResponse {
    status: string;
    error: string | null;
    data: PeriodicTableData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface PeriodicTableData {
      name:                          null | string;
      appearance:                    null | string;
      atomicMass:                    number | null;
      boil:                          number | null;
      category:                      null | string;
      density:                       number | null;
      discoveredBy:                  null | string;
      melt:                          number | null;
      molarHeat:                     number | null;
      namedBy:                       null | string;
      number:                        number | null;
      period:                        number | null;
      group:                         number | null;
      phase:                         null | string;
      source:                        null | string;
      summary:                       null | string;
      symbol:                        null | string;
      xpos:                          number | null;
      ypos:                          number | null;
      wxpos:                         number | null;
      wypos:                         number | null;
      shells:                        (number | null)[];
      electronConfiguration:         null | string;
      electronConfigurationSemantic: null | string;
      electronAffinity:              number | null;
      electronegativityPauling:      number | null;
      ionizationEnergies:            (number | null)[];
      cpkHex:                        null | string;
      block:                         null | string;
  }

  export default class periodictableWrapper {
    constructor(options: periodictableOptions);

    execute(callback: (error: any, data: periodictableResponse | null) => void): Promise<periodictableResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: periodictableResponse | null) => void): Promise<periodictableResponse>;
    execute(query?: Record<string, any>): Promise<periodictableResponse>;
  }
}
