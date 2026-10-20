# [Periodic Table API](https://apiverve.com/marketplace/periodictable?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)

Periodic Table retrieves chemical element data by element name or symbol. Responses include atomic number, category, phase, block, standard group and period positions, and CPK hex colors, with paid plans adding atomic mass and thermal metrics.

The Periodic Table API provides a simple, reliable way to integrate periodic table functionality into your applications. Built for developers who need production-ready periodic table capabilities without the complexity of building from scratch.

**[View API Details →](https://apiverve.com/marketplace/periodictable?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/Status-Active-green.svg)](https://apiverve.com/marketplace/periodictable?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
[![Method](https://img.shields.io/badge/Method-GET-blue.svg)](#)
[![Platform](https://img.shields.io/badge/Platform-Multi--Platform-orange.svg)](#installation)

**Available on:**
[![npm](https://img.shields.io/badge/npm-CB3837?style=flat&logo=npm&logoColor=white)](https://www.npmjs.com/package/@apiverve/periodictable)
[![NuGet](https://img.shields.io/badge/NuGet-004880?style=flat&logo=nuget&logoColor=white)](https://www.nuget.org/packages/APIVerve.API.PeriodicTable)
[![PyPI](https://img.shields.io/badge/PyPI-3776AB?style=flat&logo=python&logoColor=white)](https://pypi.org/project/apiverve-periodictable/)
[![RubyGems](https://img.shields.io/badge/RubyGems-E9573F?style=flat&logo=rubygems&logoColor=white)](https://rubygems.org/gems/apiverve_periodictable)
[![Packagist](https://img.shields.io/badge/Packagist-F28D1A?style=flat&logo=packagist&logoColor=white)](https://packagist.org/packages/apiverve/periodictable)
[![Go](https://img.shields.io/badge/Go-00ADD8?style=flat&logo=go&logoColor=white)](#-go)
[![Dart](https://img.shields.io/badge/Dart-0175C2?style=flat&logo=dart&logoColor=white)](https://pub.dev/packages/apiverve_periodictable)
[![JitPack](https://img.shields.io/badge/JitPack-2E7D32?style=flat&logo=android&logoColor=white)](#-android-jitpack)

---

## Quick Start

### Using JavaScript

```javascript
async function callPeriodicTableAPI() {
    try {
        const params = new URLSearchParams({
            name: 'hydrogen'
        });

        const response = await fetch(`https://api.apiverve.com/v1/periodictable?${params}`, {
            method: 'GET',
            headers: {
                'x-api-key': 'YOUR_API_KEY_HERE'
            }
        });

        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}

callPeriodicTableAPI();
```

### Using cURL

```bash
curl -X GET "https://api.apiverve.com/v1/periodictable?name=hydrogen" \
  -H "x-api-key: YOUR_API_KEY_HERE"
```

**Get your API key:** [https://apiverve.com](https://apiverve.com)

**📁 For more examples, see the [examples folder](./examples/)**

---

## Installation

Choose your preferred programming language:

### 📦 NPM (JavaScript/Node.js)

```bash
npm install @apiverve/periodictable
```

[**View NPM Package →**](https://www.npmjs.com/package/@apiverve/periodictable) | [**Package Code →**](./npm/)

---

### 🔷 NuGet (.NET/C#)

```bash
dotnet add package APIVerve.API.PeriodicTable
```

[**View NuGet Package →**](https://www.nuget.org/packages/APIVerve.API.PeriodicTable) | [**Package Code →**](./nuget/)

---

### 🐍 Python (PyPI)

```bash
pip install apiverve-periodictable
```

[**View PyPI Package →**](https://pypi.org/project/apiverve-periodictable/) | [**Package Code →**](./python/)

---

### 💎 Ruby (RubyGems)

```bash
gem install apiverve_periodictable
```

[**View RubyGems Package →**](https://rubygems.org/gems/apiverve_periodictable) | [**Package Code →**](./ruby/)

---

### 🐘 PHP (Packagist)

```bash
composer require apiverve/periodictable
```

[**View Packagist Package →**](https://packagist.org/packages/apiverve/periodictable) | [**Package Code →**](./php/)

---

### 🎯 Dart (pub.dev)

```bash
dart pub add apiverve_periodictable
```

[**View pub.dev Package →**](https://pub.dev/packages/apiverve_periodictable) | [**Package Code →**](./dart/)

---

### 🤖 Android (JitPack)

```gradle
implementation 'com.github.apiverve:periodictable-api:1.0.0'
```

[**Package Code →**](./android/)

---

### 🐹 Go

```bash
go get github.com/apiverve/periodictable-api/go
```

[**Package Code →**](./go/)

---

## Why Use This API?

| Feature | Benefit |
|---------|---------|
| **Multi-language SDKs** | Native packages for JavaScript, Python, C#, Go, and Android |
| **Simple Integration** | Single API key authentication, consistent response format |
| **Production Ready** | 99.9% uptime SLA, served from 24 global regions |
| **Comprehensive Docs** | Full examples, OpenAPI spec, and dedicated support |

---

## Documentation

- 🏠 **API Home:** [Periodic Table API](https://apiverve.com/marketplace/periodictable?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
- 📚 **API Reference:** [docs.apiverve.com/ref/periodictable](https://docs.apiverve.com/ref/periodictable)
- 📖 **OpenAPI Spec:** [openapi.yaml](./openapi.yaml)
- 💡 **Examples:** [examples/](./examples/)

---

## What Can You Build?

The Periodic Table API is commonly used for:

- **Web Applications** - Add periodic table features to your frontend or backend
- **Mobile Apps** - Native SDKs for Android development
- **Automation** - Integrate with n8n, Zapier, or custom workflows
- **SaaS Products** - Enhance your product with periodic table capabilities
- **Data Pipelines** - Process and analyze data at scale

---

## API Reference

### Authentication
All requests require an API key in the header:
```
x-api-key: YOUR_API_KEY_HERE
```

Get your API key: [https://apiverve.com](https://apiverve.com)

### Response Format

Every APIVerve endpoint returns the same envelope — check `status`, then read `data`:

```json
{
  "status": "ok",
  "error": null,
  "data": { ... }
}
```

### Example Response

A real response from the Periodic Table API:

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

---

## Support & Community

- 🏠 **API Home**: [Periodic Table API](https://apiverve.com/marketplace/periodictable?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
- 💬 **Support**: [https://apiverve.com/contact](https://apiverve.com/contact)
- 🐛 **Issues**: [GitHub Issues](../../issues)
- 📖 **Documentation**: [https://docs.apiverve.com](https://docs.apiverve.com)
- 🌐 **Website**: [https://apiverve.com](https://apiverve.com)

---

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## Security

For security concerns, please review our [Security Policy](SECURITY.md).

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Built with ❤️ by [APIVerve](https://apiverve.com)

Copyright © 2026 APIVerve. All rights reserved.
