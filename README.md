# library-management-ws-soap
###### Saityno paslaugų antras darbas WS dalis
## Instrukcija
### 1.2 
#### 6. Web servisas sugeneruotas iš XSL esančio _"src/main/resources/libraries.xsd"_ naudojant jaxb2 pluginą. 
#### Sugeneruotos klasės yra "target/generated-sources/jaxb/lt/viko/eif/librarymanagementwssoap"
#### Iš naujo sugeneruoti galima atsidariu Maven meniu ir pasirinkus "Plugins->jaxb2->jaxb2:xjc"
#### Paleidus servisą  _"LibraryManagementWsSoapApplication.java"_ su SOAPUI servisą galima pasiekti URL _"http://localhost:8080/ws/libraries.wsdl"_
#### Duomenys gaunami pasirinkus getLibrary ir suvedus "<arg0>Village Library</arg0>" pavyzdys pateiktas root aplanke esančiame _"SoapUI_example.png"_
