## Fasada

- zapewnia tylko jeden punkt styku z rozbudowanym systemem
- wystawia jedna klase, ktora wywoluje metody w roznych klasach
- klasa bedaca stykiem jest singletonem

## Singleton

- celem singletona jest ograniczenie ilosci obiektow danej klasy do jednej instancji
- singletony moga byc lazy lub egar - tworzone w trakcie wywolania lub na samym starcie aplikacji (Eagar)
- dodatkowo tzreba zabezpieczyc przez wywolanie singletona przez wiele wątków
