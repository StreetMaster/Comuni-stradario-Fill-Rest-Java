# Comuni italiani e stradario. Web Service di verifica e correzione.
## Fill Rest Java
Comuni italiani e stradario. Soluzione Java per l'utilizzo del ws rest FILL di verifica e correzione.

### Ambiente di sviluppo
  - NetBeans IDE 8.1
  - JDK 1.8

### Endpoint 
```
     https://streetmaster.streetmaster.it/smrest/fill
```     
Il protocollo di comunicazione e' in formato JSON 

### Key
Per l'utilizzo registrarsi sul sito http://streetmaster.it e richiedere la chiave per il servizio FILL.

### Condizioni
Il servizio permette di effettuare in maniera gratuita 250 chiamate mensili. 
Per volumi di utilizzo maggiori consultare nel sito i piani di utilizzo.
Se non viene utilizzata una chiave valida il servizio restituisce il codice di errore 997: chiave non riconosciuta

### Ouput
Il servizio verifica e corregge indirizzi italiani con una copertura a livello di singola strada su tutto il territorio nazionale.
La base dati di riferimento è costantemente aggiornata con le variazioni amministrative e postali ufficiali.
La versione FILL rispetto alla versione VERIFY correda l'output con molti dati aggiuntivi.
  
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
  - 05/12/2016 Inserimento nuovi comuni di Alpago e Val di Zoldo
  - 05/12/2016 Soppressione comuni di Zoldo Alto,Forno di Zoldo,Prestine, Ivano-Francena,Farra d'Alpago,Pieve d'Alpago,Puos d'Alpago
  - 08/05/2017 Inserimento nuovi comuni di Abetone Cutigliano,San Marcello Piteglio,Valfornace,Colli al Metauro,Terre Roveresche,Alta Valle Intelvi,Terre del Reno
  - 08/05/2017 Soppressione comuni di Selve Marcone,Cavallasca,Acquacanina,Abetone,Cutigliano,San Marcello Pistoiese,Piteglio,San Giovanni D'Asso,Fiordimonte,Pievebovigliana,Piagge,Barchi,Orciano Di Pesaro,San Giorgio Di Pesaro,Montemaggiore Al Metauro,Saltara,Serrungarina,Mirabello,Sant'Agostino,Lanzo D'Intelvi,Pellio Intelvi,Ramponio Verna
  - 06/12/2017 Adeguamento struttura amministrativa della Sardegna. Soppressione delle provincie di Medio Campidano,Carbonia-Iglesias, Olbia-Tempio, Ogliastra e creazione della provincia Sud Sardegna
  - 18/06/2018 Inserimento nuovi comuni di Alta Val Tidone, Alluvioni Piovera, Alto Sermenza, Cellio con Breia, Montalto Carpasio, Sen Jean di Fassa, Valvarrone, Borgo Mantovano, Centro Valle Intelvi, Castelgerundo, Casali del Manco, Laterina Pergine Valdarno, Rio, Val Liona, Sermide e Felonica. Cambio di provincia per Sappada.
  - 18/06/2018 Soppressione comuni di Caminata, Nibbiano, Pecorara, Gavazzana, Alluvioni Canbio', Piovera, Rima San Giuseppe, Rimasco, Breia, Cellio, Sabbia, Carpasio, Montalto Ligure, Pozza di Fassa, Vigo di Fassa, Introzzo, Tremenico, Vestreno, Pieve di Coriano, Revere, Villa Poma, Felonica, Sermide, Casasco d'Intelvi, Castiglione d'Intelvi, San Fedele d'Intelvi, Camairago, Cavacurta, Casole Bruzio, Pedace, Serra Pedace, Spezzano Piccolo, Trenta, Laterina, Pergine Valdarno, Rio Marina, Rio nell'Elba, Grancona, San Germano dei Berici
  - 19/11/2018 Inserimento nuovi comuni di Fiumicello Villa Vicentina, Treppo Ligosullo, Corigliano-Calabro, Barbarano Mossano e Borgo Veneto
  - 19/11/2018 Soppressione comuni di Villa Vicentina, Fiumicello, Ligosullo, Treppo Carnico, Rossano, Corigliano Calabro, Mossano, Barbarano Vicentino, Megliadino San Fidenzio, Santa Margherita d'Adige e Saletto 
  - 18/06/2019 Inserimento nuovi comuni di Valle Cannobina,Val di Chy,Valchiusa,Quaregna Cerreto,Valdilana,Gattico-Veruno,Lu e Cuccaro Monferrato,Terre d'Adige,Riva del Po,Tresignana,Sorbolo Mezzani,Barberino Tavarnelle,Borgocarbonara,Solbiate con Cagno,Piadena Drizzona,Colli Verdi,Vermezzo con Zelo,Cadrezzate con Osmate,Sassocorvaro Auditore,Borgo Valbelluna,Pieve del Grappa,Valbrenta,Valstagna,Lusiana Conco,Colceresa. Cambio di nome per Negrar di Valpolicella e San Giorgio Bigarello
  - 18/06/2019 Soppressione comuni di Cavaglio-Spoccia,Cursolo-Orasso,Falmenta,Alice Superiore,Lugnacco,Pecco,Vico Canavese,Trausella,Meugliano,Cerreto Castello,Quaregna,Mosso,Soprana,Trivero,Valle Mosso,Camo,Valmala,Castellar,Gattico,Veruno,Riva Valdobbia,Lu,Cuccaro Monferrato,Zambana,Nave San Rocco,Berra,Ro,Formignana,Tresigallo,Mezzani,Sorbolo,Barberino Val d'Elsa,Tavarnelle Val di Pesa,Borgofranco sul Po,Carbonara di Po,Bigarello,Solbiate,Cagno,Piadena,Drizzona,Ca' d'Andrea,Canevino,Ruino,Valverde(PV),Vermezzo,Zelo Surrigone,Cadrezzate,Osmate,Auditore,Sassocorvaro,Lentiai,Mel,Trichiana,Crespano del Grappa,Paderno del Grappa,Campolongo sul Brenta,Cismon del Grappa,San Nazario,Valstagna,Lusiana,Conco,Mason Vicentino,Molvena              
  - 09/12/2019 Soppressione comuni di Presicce e Acquarica del Capo
  - 09/12/2019 Creazione comune di Presicce-Acquarica
  - 25/05/2020 Soppressione comuni Castelfondo,Fondo,Malosco,Cagno',Revo,Romallo,Cloz,Brez,Carano,daiano,Varena,Faedo,Vendrogno
  - 25/05/2020 Creazione comuni di Novella,Borgo d'Anaunia,Ville di Fiemme
  - 25/05/2020 Riorganizzazione cap della provincia di Milano
  - 07/12/2020 Soppressione comune di Monteciccardo
  
### Support
Per ogni domanda o chiarimento manda una mail a supporto@streetmaster.it

