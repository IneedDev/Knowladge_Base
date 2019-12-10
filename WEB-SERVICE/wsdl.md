#### WSDL

    <types> -  dziala jak kontener do definiowania typow danych uzywanyc w elemencie <message>. <message> definiuje format komunikatow wymienianych miedzy klientem i Web Serwisem.
        <xs:element name=" " type=" ">
    <message> - wiadomosc ktore bedzie wymieniana pomiedzy klientem a web serverem. Wiadomosci te wyjasniaja operacje input output
    <porttype> - element specyfikuje podzbior operacji wspieranych przez punkt koncowy danego Web Serwisu. W pewnym sensie, <portType> dostarcza unikatowego identyfikatora do grupy akcji, ktore mogą być wykonane w pojedynczym punkcie koncowym.
    <operation> - jest to abstrakcyjna definicja akcji wspieranej przez Web Serwis. Element ten jest analogiczny do definicji metoidy w Javie.
    <binding> - element oznacza konkretny protokol i specyfikacje formatu danych dla danego elementu <portType>. 
    <service> - jest to element pojawiajacy się typowo na koncu dokumentu WSDL i identyfikujacy dany Web Serwis 