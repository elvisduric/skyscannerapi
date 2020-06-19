# skyscannerapi

- Skripte su pisane u Eclipse IDE korištenjem Java programming language.
- Na Project Libraries je potrebno dodati external Selenium libraries koje možete preuzeti na https://www.selenium.dev/downloads/
- Potrebno je instalirati TestNG Eclipse Plug-in https://testng.org/doc/download.html
- Dodati TestNG Library na Project Libraries //Project Properties > Java Build Path > Libraries//

Struktura automation testova je kreirana po Page Object Modelu gdje sam na odvjenim klasama (ObjectRepository) definisao elemente a na zasebnom TestCases package sam pisao test cases.

Također, kreiran je testng.xml file kojeg je potrebno pokrenuti Run As > TestNG Suite da bi se izvršio Sanity Testing za dva napisana test case-a.

--Elvis
