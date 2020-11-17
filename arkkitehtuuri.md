# Arkkitehtuurikuvaus



## Yleisesti

Pelin mato ja syötti koostuvat yksittäisistä koordinaatein muodostetuista palasista. Syötti on yksittäinen koordinaatti, ja mato on jono joka sisältää useita koordinaatteja. Sitä mukaan kun mato liikkuu, jonon rakenne muuttuu. 

<img src="" width="700">

## Käyttöliittymä

Käyttöliittymä toimii yhden näkymän sisällä.

Pelinäytöllä näkyy pelaajan kerryttämät pisteen reaaliaikaisesti. Pelin päätyttyä ruudulla näkyy teksti  joka ilmoittaa pelin loppumisesta, sekä lopullisen pistemäärän.

## Tiedostot

Ohjelma ei ylläpidä tai tallenna aiemmin pelattuja kierroksia.

Jokainen peli alkaa alusta kun ohjelman käynnistää, ja pistetiedot eivät jää muistiin.

## Heikkoudet & parannettavaa

Sovelluksen seuraava kehitysaskel olisi kehittää sovellusta niin että se ylläpitäisi tietokantaa parhaimmista tuloksista. Esimerkiksi top5 tulokset. 

Sovellukselle olisi hyvä luoda "pelaa uudelleen" -nappi, jolla pelin päätyttyä pelaaja voisi aloittaa uuden pelin käynnistämättä sovellusta uudelleen. 

