[![Latest version](https://img.shields.io/maven-central/v/software.xdev/brevo-java-client?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/brevo-java-client)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/brevo-java-client/check-build.yml?branch=develop)](https://github.com/xdev-software/brevo-java-client/actions/workflows/check-build.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_brevo-java-client&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_brevo-java-client)
[![API Specification Editor](https://img.shields.io/badge/API--Spec-Editor-85ea2d?logo=swagger)](https://editor.swagger.io/?url=https://raw.githubusercontent.com/xdev-software/brevo-java-client/develop/openapi/openapi.yml)

# <img src="https://corp-backend.brevo.com/wp-content/uploads/2023/05/favicon.svg" height="28" /> [brevo](https://brevo.com)-java-client

A Java client for the [Brevo](https://brevo.com) (formerly [SendinBlue](https://help.brevo.com/hc/en-us/articles/11279317272722-FAQs-Sendinblue-becomes-Brevo)) API

> [!IMPORTANT]
> An API-Key is required.<br/>
> You can get it at https://app.brevo.com/settings/keys/api

This client [is generated](./brevo-java-client/pom.xml) from an [``openapi.yml``](./openapi/openapi.yml) using [OpenAPI Generator](https://openapi-generator.tech/).

> [!NOTE]
> <details><summary>Why did you create this API client and not use <a href="https://github.com/sendinblue/APIv3-java-library">the official one</a>?</summary>
>
> We had some problems (as of March 2024) with the "official" client:
> * The client looks seriously outdated:
>   * it is still called "SendinBlue"
>   * was last updated over a year ago and there was no activity (on issues/PR) since then
>   * There is at least one CVE in the underlying HTTP client
> * It looks like there are problems with the underlying dependencies:
>   * ``maven-gpg-plugin`` is declared as compile dependency
>   * There is a [dependency for Java 7](https://www.threeten.org/threetenbp/) however the client is built for Java 8+
> * ...
>
> </details>

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/brevo-java-client/releases/latest#Installation)

## Demo
A minimal demo is also available [here](./brevo-java-client-demo/src/main/java/software/xdev/Application.java).

## Support
If you need support as soon as possible and you can't wait for any pull request, feel free to use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/brevo-java-client/dependencies)

<sub>Disclaimer: This is not an official Brevo product and not associated with Brevo</sub>
