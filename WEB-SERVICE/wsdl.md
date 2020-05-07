#### WSDL

    <types> -  dziala jak kontener do definiowania typow danych uzywanyc w elemencie <message>. <message> definiuje format komunikatow wymienianych miedzy klientem i Web Serwisem.
        <xs:element name=" " type=" ">
    <message> - wiadomosc ktore bedzie wymieniana pomiedzy klientem a web serverem. Wiadomosci te wyjasniaja operacje input output
    <porttype> - element specyfikuje podzbior operacji wspieranych przez punkt koncowy danego Web Serwisu. W pewnym sensie, <portType> dostarcza unikatowego identyfikatora do grupy akcji, ktore mogą być wykonane w pojedynczym punkcie koncowym.
    <operation> - jest to abstrakcyjna definicja akcji wspieranej przez Web Serwis. Element ten jest analogiczny do definicji metoidy w Javie.
    <binding> - element oznacza konkretny protokol i specyfikacje formatu danych dla danego elementu <portType>. 
    <service> - jest to element pojawiajacy się typowo na koncu dokumentu WSDL i identyfikujacy dany Web Serwis 
    
    
#### soa-model wsdl diff
    Download Membrane SOA Model 1.4.x and extract the zip file.
    Add a new environment variable "SOA_MODEL_HOME" to your system, which points to where SOA Model is extracted.
    Add "%SOA_MODEL_HOME%\bin" to your system path.
    Now you can open a commandline and run the tools.
    
    run
    ~/Apps/soa-model/bin/wsdldiff.sh test.wsdl webWsdlToCompare /tmp/diff
    Report generated in /tmp/diff
    
