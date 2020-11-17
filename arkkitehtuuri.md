# Arkkitehtuurikuvaus



## Yleisesti

Pelin mato ja syötti koostuvat yksittäisistä koordinaatein muodostetuista palasista. Syötti on yksittäinen koordinaatti, ja mato on jono joka sisältää useita koordinaatteja. Sitä mukaan kun mato liikkuu, jonon rakenne muuttuu. 

## Käyttöliittymä

<img src="<!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=5,IE=9" ><![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>Untitled Diagram</title>
<meta charset="utf-8"/>
</head>
<body><div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;toolbar&quot;:&quot;zoom layers lightbox&quot;,&quot;edit&quot;:&quot;_blank&quot;,&quot;xml&quot;:&quot;&lt;mxfile host=\&quot;app.diagrams.net\&quot; modified=\&quot;2020-11-17T08:50:14.371Z\&quot; agent=\&quot;5.0 (Windows)\&quot; etag=\&quot;OzL6Cp-1X2eRNyh8rUfx\&quot; version=\&quot;13.9.9\&quot; type=\&quot;github\&quot;&gt;&lt;diagram id=\&quot;UoudJURrVf0bupkFWlg_\&quot; name=\&quot;Page-1\&quot;&gt;7Zpbb9owFMc/TR475UK4PFJou6lrh8Q0YC+TRzzwCHHkOED26ecQh9ghgEkbaCReWvv4kuT8f+f4IjSrt9w8EeDPX7ADXc3UnY1m9TXTtNoG+xsbosTQsLhhRpCTmPTMMET/YGI0UmuIHBhwW2KiGLsU+bJxij0PTqlkA4TgtdztD3YdyeCDGdwzDKfA3beOkEPnibVttjL7Z4hm8/TJRrOTtCxB2pl/STAHDl4LJutBs3oEY5qUlpsedGPfyX55PNC6ezECPaoyIHz0+937FWreG+PJyA6+uz/u7vgsK+CG/IM1s+my+e4dtGLFWVwcQBelZja/0FLQGbG3MXUXrmAUaGaPlReYLGAYCN1PTvICKE58iDWrqzxsGGk9S7tvUopihwu1M549QAGFLggWIYlnSUtZ398kPzo/51ZuGqUMERx6Doxl0Fnzeo4oHPpgGreuWdAw25wuXVYzdqNFWVONIKFwI5i4zE8QLyElEeuSBp3OkeMxZ/PqOgPYSKmcC/C2uQ3wmJntZs6wYgVOVjFl6Nvo5+to8GWMX6b96WCAHsa/1CljHQIK1KXagqn78b8a6dNoy/qYivo0q9LHVNFniFdsqjBwEaI0Wsax1W2cFViFaikNS7nQeaFGYu+U/ChiW0rBKCXBs1K/Hw+FH1iRfPgZzWtL0lCKP3FxU1TkGWPiIA+AZEVcSNWaBJDZtk/LZV9SLltFrucCXytG0Ibtm6I65Tgzv6BdPaKaKhIlu0xFabqEgOgry218X/oXe7hOGuXXoetnvZaKRq/A95OtBlrGzt+mwGf2Bp7HDk6lzhP10ayjEFYXzXztAslyPoKe043P3azmYQ/KPoEbRMdCeRK78pPNa/0N9+y2EvHKQT8GOCRTePpwCx3piL/vbcGdRd5MbYRtiChayRcDRS7mTxjgNJ3zmw9ZzVZbniH5HD5IPMfn52l15HlyYlNAZpDuzbPVe/fR5RHovBUBjz1/LFYSCFp2Ws8w2NbO4uDYjjdxTG14sfLb1E5OaGVgcuAZjcsSk17lvTlr6GdkjUOYvQtlx+gRKTt22L5R9s6UFV1ilKLsk2kLoBlqmIkJbCKRdS3OmjfOKuGs6P6k1AIoJKOJ2HaAmIxPEU/9KJ7l10xbkbLGjbJKKCu6EipH2XnrX2U79GM56iRl9o2ySigrusl6j1x2avUrzmXHl9rqKWt9KMqMliHBwbirKWVFFz3ldmbqK1/ZVbY8ZY19ym6nzAtSVs3dlKl4zMwts2Z1txmmYja7cXYmZ6ya/Ron6Z79pMl6+A8=&lt;/diagram&gt;&lt;/mxfile&gt;&quot;}"></div>
<script type="text/javascript" src="https://viewer.diagrams.net/js/viewer-static.min.js"></script>
</body>
</html>" width="700">

Käyttöliittymä toimii yhden näkymän sisällä.

Pelinäytöllä näkyy pelaajan kerryttämät pisteen reaaliaikaisesti. Pelin päätyttyä ruudulla näkyy teksti  joka ilmoittaa pelin loppumisesta, sekä lopullisen pistemäärän.

## Tiedostot

Ohjelma ei ylläpidä tai tallenna aiemmin pelattuja kierroksia.

Jokainen peli alkaa alusta kun ohjelman käynnistää, ja pistetiedot eivät jää muistiin.

## Heikkoudet & parannettavaa

Sovelluksen seuraava kehitysaskel olisi kehittää sovellusta niin että se ylläpitäisi tietokantaa parhaimmista tuloksista. Esimerkiksi top5 tulokset. 

Sovellukselle olisi hyvä luoda "pelaa uudelleen" -nappi, jolla pelin päätyttyä pelaaja voisi aloittaa uuden pelin käynnistämättä sovellusta uudelleen. 

