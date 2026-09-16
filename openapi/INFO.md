This ``openapi.yml`` is based on the [official available one](https://api.brevo.com/v3/swagger_definition_v3.yml) with minor modifications.

Changes to fix generation:
* Replaced 
    ```yaml
    additionalProperties:
        oneOf:
    ```
    with `additionalProperties: true`
* Replaced `oneOf`s in `postContactInfo` (see https://github.com/xdev-software/brevo-java-client/issues/243)
* Replaced `oneOf`s in `order->metaInfo` with `additionalProperties: true`
* Changed type of `id` (in response) in `createDomain` to `string` (see https://github.com/xdev-software/brevo-java-client/issues/206)

The Java API Client can be generated using ``mvn clean compile -P openapi-generator`` inside [``brevo-java-client``](../brevo-java-client/).

Helpful links:
* https://jsonformatter.org/json-to-jsonschema
* https://swagger.io/specification/
* https://editor.swagger.io/
