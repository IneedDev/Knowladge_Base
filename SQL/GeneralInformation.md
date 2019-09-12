Operacje DML, DDL, DCL występują w każdym języku SQL. Jest to podział operacji wykonywanych na bazie lub serwerze w zależności od grupy czynności, jaką wykonujesz: manipulacja danymi, definiowanie, sterowanie (nie mylmy z kontrolą), wyświetlanie tabeli / setu danych.

DQL – Data Query Language. DQL to instrukcje, za pomocą których możesz otrzymać z bazy określone dane. Najważniejszym poleceniem jest tutaj SELECT.

DML – Data Manipulation Language. Instrukcje manipulacji danymi. Możemy do nich zaliczyć polecenia takie jak INSERT, UPDATE, DELETE. Najważniejszą cechą tych instrukcjii jest to, że za ich pomocą możemy manipulować danymi w obiektach takich jak tabele.

DDL – Data Definition Language. Instrukcje definiujące. Możemy do nich zaliczyć polecenia takie jak CREATE, ALTER, DROP. Za pomocą instrukcji DDL nie manipulujemy bezpośrednio danymi, a ich strukturą. Możemy zdefiniować kolumny tabel, zmienić typy danych, czy usunąć obiekt taki jak widok, czy tabela.

DCL – Data Control Language. Instrukcje sterujące uprawnieniami w bazie danych / serwerze. Za ich pomocą możemy dandawać np uprawnienia użytkownikom do obiektów, przypisywać role, zmieniać hasła itp. Najważniejsze grupy poleceń to GRANT, DENY, REVOKE. Za pomocą GRANT przyznajemy uprawnienia. REVOKE służy do odbierania uprawnień. DENY zabrania dostępu. Instrukcje te są szczególnie istotne przy administracji serwerem.