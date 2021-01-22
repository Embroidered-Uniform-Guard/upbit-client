/* 
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Trade
    /// </summary>
    [DataContract]
    public partial class Trade :  IEquatable<Trade>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Trade" /> class.
        /// </summary>
        /// <param name="market">마켓의 유일 키.</param>
        /// <param name="uuid">체결의 고유 아이디.</param>
        /// <param name="price">체결 가격.</param>
        /// <param name="volume">체결 양.</param>
        /// <param name="funds">체결된 총 가격.</param>
        /// <param name="side">체결 종류.</param>
        /// <param name="createdAt">체결 시각.</param>
        public Trade(string market = default(string), string uuid = default(string), string price = default(string), string volume = default(string), string funds = default(string), string side = default(string), string createdAt = default(string))
        {
            this.Market = market;
            this.Uuid = uuid;
            this.Price = price;
            this.Volume = volume;
            this.Funds = funds;
            this.Side = side;
            this.CreatedAt = createdAt;
        }
        
        /// <summary>
        /// 마켓의 유일 키
        /// </summary>
        /// <value>마켓의 유일 키</value>
        [DataMember(Name="market", EmitDefaultValue=false)]
        public string Market { get; set; }

        /// <summary>
        /// 체결의 고유 아이디
        /// </summary>
        /// <value>체결의 고유 아이디</value>
        [DataMember(Name="uuid", EmitDefaultValue=false)]
        public string Uuid { get; set; }

        /// <summary>
        /// 체결 가격
        /// </summary>
        /// <value>체결 가격</value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public string Price { get; set; }

        /// <summary>
        /// 체결 양
        /// </summary>
        /// <value>체결 양</value>
        [DataMember(Name="volume", EmitDefaultValue=false)]
        public string Volume { get; set; }

        /// <summary>
        /// 체결된 총 가격
        /// </summary>
        /// <value>체결된 총 가격</value>
        [DataMember(Name="funds", EmitDefaultValue=false)]
        public string Funds { get; set; }

        /// <summary>
        /// 체결 종류
        /// </summary>
        /// <value>체결 종류</value>
        [DataMember(Name="side", EmitDefaultValue=false)]
        public string Side { get; set; }

        /// <summary>
        /// 체결 시각
        /// </summary>
        /// <value>체결 시각</value>
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Trade {\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  Funds: ").Append(Funds).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Trade);
        }

        /// <summary>
        /// Returns true if Trade instances are equal
        /// </summary>
        /// <param name="input">Instance of Trade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Trade input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Uuid == input.Uuid ||
                    (this.Uuid != null &&
                    this.Uuid.Equals(input.Uuid))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.Volume == input.Volume ||
                    (this.Volume != null &&
                    this.Volume.Equals(input.Volume))
                ) && 
                (
                    this.Funds == input.Funds ||
                    (this.Funds != null &&
                    this.Funds.Equals(input.Funds))
                ) && 
                (
                    this.Side == input.Side ||
                    (this.Side != null &&
                    this.Side.Equals(input.Side))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
                if (this.Uuid != null)
                    hashCode = hashCode * 59 + this.Uuid.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.Volume != null)
                    hashCode = hashCode * 59 + this.Volume.GetHashCode();
                if (this.Funds != null)
                    hashCode = hashCode * 59 + this.Funds.GetHashCode();
                if (this.Side != null)
                    hashCode = hashCode * 59 + this.Side.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
