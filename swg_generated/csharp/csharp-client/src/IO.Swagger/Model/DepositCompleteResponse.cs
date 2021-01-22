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
    /// DepositCompleteResponse
    /// </summary>
    [DataContract]
    public partial class DepositCompleteResponse :  IEquatable<DepositCompleteResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DepositCompleteResponse" /> class.
        /// </summary>
        /// <param name="currency">화폐를 의미하는 영문 대문자 코드.</param>
        /// <param name="depositAddress">입금 주소.</param>
        /// <param name="secondaryAddress">2차 입금 주소.</param>
        public DepositCompleteResponse(string currency = default(string), string depositAddress = default(string), string secondaryAddress = default(string))
        {
            this.Currency = currency;
            this.DepositAddress = depositAddress;
            this.SecondaryAddress = secondaryAddress;
        }
        
        /// <summary>
        /// 화폐를 의미하는 영문 대문자 코드
        /// </summary>
        /// <value>화폐를 의미하는 영문 대문자 코드</value>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public string Currency { get; set; }

        /// <summary>
        /// 입금 주소
        /// </summary>
        /// <value>입금 주소</value>
        [DataMember(Name="deposit_address", EmitDefaultValue=false)]
        public string DepositAddress { get; set; }

        /// <summary>
        /// 2차 입금 주소
        /// </summary>
        /// <value>2차 입금 주소</value>
        [DataMember(Name="secondary_address", EmitDefaultValue=false)]
        public string SecondaryAddress { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DepositCompleteResponse {\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  DepositAddress: ").Append(DepositAddress).Append("\n");
            sb.Append("  SecondaryAddress: ").Append(SecondaryAddress).Append("\n");
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
            return this.Equals(input as DepositCompleteResponse);
        }

        /// <summary>
        /// Returns true if DepositCompleteResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of DepositCompleteResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DepositCompleteResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.DepositAddress == input.DepositAddress ||
                    (this.DepositAddress != null &&
                    this.DepositAddress.Equals(input.DepositAddress))
                ) && 
                (
                    this.SecondaryAddress == input.SecondaryAddress ||
                    (this.SecondaryAddress != null &&
                    this.SecondaryAddress.Equals(input.SecondaryAddress))
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
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
                if (this.DepositAddress != null)
                    hashCode = hashCode * 59 + this.DepositAddress.GetHashCode();
                if (this.SecondaryAddress != null)
                    hashCode = hashCode * 59 + this.SecondaryAddress.GetHashCode();
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
