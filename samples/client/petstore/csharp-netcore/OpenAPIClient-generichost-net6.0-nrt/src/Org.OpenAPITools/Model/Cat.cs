// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Cat
    /// </summary>
    public partial class Cat : Animal, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Cat" /> class.
        /// </summary>
        /// <param name="className">className</param>
        /// <param name="declawed">declawed</param>
        /// <param name="color">color (default to &quot;red&quot;)</param>
        [JsonConstructor]
        public Cat(string className, bool declawed, string color = @"red") : base(className, color)
        {
            Declawed = declawed;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets Declawed
        /// </summary>
        [JsonPropertyName("declawed")]
        public bool Declawed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Cat {\n");
            sb.Append("  ").Append(base.ToString()?.Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Declawed: ").Append(Declawed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Cat" />
    /// </summary>
    public class CatJsonConverter : JsonConverter<Cat>
    {
        /// <summary>
        /// Deserializes json to <see cref="Cat" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Cat Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            string? className = default;
            bool? declawed = default;
            string? color = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        case "className":
                            className = utf8JsonReader.GetString();
                            break;
                        case "declawed":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                declawed = utf8JsonReader.GetBoolean();
                            break;
                        case "color":
                            color = utf8JsonReader.GetString();
                            break;
                        default:
                            break;
                    }
                }
            }

            if (className == null)
                throw new ArgumentNullException(nameof(className), "Property is required for class Cat.");

            if (declawed == null)
                throw new ArgumentNullException(nameof(declawed), "Property is required for class Cat.");

            if (color == null)
                throw new ArgumentNullException(nameof(color), "Property is required for class Cat.");

            return new Cat(className, declawed.Value, color);
        }

        /// <summary>
        /// Serializes a <see cref="Cat" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="cat"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Cat cat, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            writer.WriteString("className", cat.ClassName);
            writer.WriteBoolean("declawed", cat.Declawed);
            writer.WriteString("color", cat.Color);

            writer.WriteEndObject();
        }
    }
}
