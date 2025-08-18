This ``openapi.yml`` is based on the [official available one](https://api.brevo.com/v3/swagger_definition_v3.yml) with minor modifications.

Changes:
* Replaced 
    ```yaml
    additionalProperties:
        oneOf:
    ```
    with ``additionalProperties: true`` as it can't be generated correctly otherwise

The Java API Client can be generated using ``mvn clean compile -P openapi-generator`` inside [``brevo-java-client``](../brevo-java-client/).

Helpful links:
* https://jsonformatter.org/json-to-jsonschema
* https://swagger.io/specification/
* https://editor.swagger.io/
