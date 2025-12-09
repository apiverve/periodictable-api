using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.PeriodicTable
{
    /// <summary>
    /// Query options for the Periodic Table API
    /// </summary>
    public class PeriodicTableQueryOptions
    {
        /// <summary>
        /// The name of the chemical element to get information about
        /// Example: hydrogen
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }
    }
}
