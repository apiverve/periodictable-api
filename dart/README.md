# Periodic Table API - Dart/Flutter Client

Periodic Table retrieves chemical element data by element name or symbol. Responses include atomic number, category, phase, block, standard group and period positions, and CPK hex colors, with paid plans adding atomic mass and thermal metrics.

[![pub package](https://img.shields.io/pub/v/apiverve_periodictable.svg)](https://pub.dev/packages/apiverve_periodictable)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is the Dart/Flutter client for the [Periodic Table API](https://apiverve.com/marketplace/periodictable?utm_source=dart&utm_medium=referral&utm_content=readme).

## Installation

Add this to your `pubspec.yaml`:

```yaml
dependencies:
  apiverve_periodictable: ^1.2.5
```

Then run:

```bash
dart pub get
# or for Flutter
flutter pub get
```

## Usage

```dart
import 'package:apiverve_periodictable/apiverve_periodictable.dart';

void main() async {
  final client = PeriodictableClient('YOUR_API_KEY');

  try {
    final response = await client.execute({
      'name': 'hydrogen'
    });

    print('Status: ${response.status}');
    print('Data: ${response.data}');
  } catch (e) {
    print('Error: $e');
  }
}
```

## Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "count": 1,
    "elements": [
      {
        "name": "Hydrogen",
        "appearance": "colorless gas",
        "atomic_mass": 1.008,
        "boil": 20.271,
        "category": "diatomic nonmetal",
        "density": 0.08988,
        "discovered_by": "Henry Cavendish",
        "melt": 13.99,
        "molar_heat": 28.836,
        "named_by": "Antoine Lavoisier",
        "number": 1,
        "period": 1,
        "group": 1,
        "phase": "Gas",
        "source": "https://en.wikipedia.org/wiki/Hydrogen",
        "summary": "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
        "symbol": "H",
        "xpos": 1,
        "ypos": 1,
        "wxpos": 1,
        "wypos": 1,
        "shells": [
          1
        ],
        "electron_configuration": "1s1",
        "electron_configuration_semantic": "1s1",
        "electron_affinity": 72.769,
        "electronegativity_pauling": 2.2,
        "ionization_energies": [
          1312
        ],
        "cpk-hex": "ffffff",
        "block": "s"
      }
    ]
  }
}
```

## API Reference

- **API Home:** [Periodic Table API](https://apiverve.com/marketplace/periodictable?utm_source=dart&utm_medium=referral&utm_content=readme)
- **Documentation:** [docs.apiverve.com/ref/periodictable](https://docs.apiverve.com/ref/periodictable?utm_source=dart&utm_medium=referral&utm_content=readme)

## Authentication

All requests require an API key. Get yours at [apiverve.com](https://apiverve.com?utm_source=dart&utm_medium=referral&utm_content=readme).

## License

MIT License - see [LICENSE](LICENSE) for details.

---

Built with Dart for [APIVerve](https://apiverve.com?utm_source=dart&utm_medium=referral&utm_content=readme)
