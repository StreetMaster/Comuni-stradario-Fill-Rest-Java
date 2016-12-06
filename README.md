# Web Service di verifica e correzione degli indirizzi italiani
## Demo Fill Rest Java
Demo Java per l'utilizzo del ws rest FILL di verifica, correzione e normalizzazione degli indirizzi italiani

### Ambiente di sviluppo
  - NetBeans IDE 8.1
  - JDK 1.8

### Endpoint 
```
     http://ec2-46-137-97-173.eu-west-1.compute.amazonaws.com/smrest/fill
```     
Il protocollo di comunicazione e' in formato JSON 

### Key
Per l'utilizzo registrarsi sul sito http://streetmaster.it e richiedere la chiave per il servizio FILL.
Il servizio permette di effettuare in maniera gratuita 250 chiamate mensili. 

### Condizioni
Per volumi di utilizzo maggiori consultare nel sito i piani di utilizzo.
Se non viene utilizzata una chiave valida il servizio restituisce il codice di errore 997: chiave non riconosciuta

Il servizio verifica e corregge indirizzi italiani con una copertura a livello di singola strada su tutto il territorio nazionale.
La base dati di riferimento è costantemente aggiornata con le variazioni amministrative e postali ufficiali.
La versione FILL rispetto alla versione VERIFY correda l'output con molti dati aggiuntivi.
  
### Ouput
Output di base:
  - indirizzo verificato e corretto in tutti i suoi compomenti
  - score di riconoscimento comune e strada
  - matrice di flag di modifica tra input e output
  
Informazioni aggiuntive FILL  
 - versione abbreviata dei componenti dell'indirizzo
 - versione postale
 - geocodifica
 - scomposizione del civico 
 - codiche ISTAT\catasto\ABI
 - sezione di censimento 2001/2011
 - zone OMI

### Aggiornamenti base dati comunale
  - 01/01/2016 Istituzione
  - 05/12/2066 Inserimento nuovi comuni di Alpago e Val di Zoldo
  - 05/12/2016 Soppressione comuni di Zoldo Alto,Forno di Zoldo,Prestine, Ivano-Francena,Farra d'Alpago,Pieve d'Alpago,Puos d'Alpago
 
### Support
Per ogni domanda o chiarimento manda una mail a supporto@streetmaster.it

