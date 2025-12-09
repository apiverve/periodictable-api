declare module '@apiverve/periodictable' {
  export interface periodictableOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface periodictableResponse {
    status: string;
    error: string | null;
    data: PeriodicTableData;
    code?: number;
  }


  interface PeriodicTableData {
      name:                          string;
      appearance:                    string;
      atomicMass:                    number;
      boil:                          number;
      category:                      string;
      density:                       number;
      discoveredBy:                  string;
      melt:                          number;
      molarHeat:                     number;
      namedBy:                       string;
      number:                        number;
      period:                        number;
      group:                         number;
      phase:                         string;
      source:                        string;
      summary:                       string;
      symbol:                        string;
      xpos:                          number;
      ypos:                          number;
      wxpos:                         number;
      wypos:                         number;
      shells:                        number[];
      electronConfiguration:         string;
      electronConfigurationSemantic: string;
      electronAffinity:              number;
      electronegativityPauling:      number;
      ionizationEnergies:            number[];
      cpkHex:                        string;
      block:                         string;
  }

  export default class periodictableWrapper {
    constructor(options: periodictableOptions);

    execute(callback: (error: any, data: periodictableResponse | null) => void): Promise<periodictableResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: periodictableResponse | null) => void): Promise<periodictableResponse>;
    execute(query?: Record<string, any>): Promise<periodictableResponse>;
  }
}
