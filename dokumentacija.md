# 🎬 Moji Filmovi

Ime i prezime: Emir Babačić
Indeks: 199/IT-20
Predmet: Razvoj mobilnih aplikacija
Naziv aplikacije: Moji Filmovi

## 1. Kratak opis funkcionalnosti aplikacije

Aplikacija "Moji Filmovi" je zabavna mobilna aplikacija koja je namijenjena svim ljubiteljima filmova.
Korisnicima omogućava više funkcionalnosti kroz interaktivni i pregledni korisnički interfejs:

Moji Filmovi – korisnici mogu da na jednom mjestu imaju sve pregledane filmove, te mogućnosti da dodaju nove filmove i da čuvaju informacije poput naziva filma, žanra, godine i ocjene, u zavisnosti koliko im se svidio film.

Filmski kviz – aplikacija nudi dinamičan kviz o filmovima u kojem korisnici odgovaraju na pitanja i skupljaju bodove, uz sistem nagrađivanja i oduzimanja bodova.

Igra "Pogodi film" – korisnici pokušavaju pogoditi naziv filma na osnovu nasumično izmiješanih slova, testirajući svoje znanje i asocijativno razmišljanje.

Rezultati i dijeljenje bodova – na kraju svake igre, korisnik ima mogućnost da podijeli svoj rezultat sa svojim prijateljima.

Informacije o aplikaciji – kroz posebnu sekciju, korisnik se može upoznati sa svrhom i načinom korištenja aplikacije.

## 2. Navigacioni tok i opis ekrana

Aplikacija "Moji Filmovi" koristi Jetpack Navigation Compose za upravljanje navigacijom između ekrana.
Navigacioni tok je definisan unutar Navigation funkcije, gdje se koristi NavHost i skup composable ruta za pojedinačne ekrane.
Početna ruta (startDestination) je home, a korisnik se može kretati između sljedećih ekrana:

### 2.1. HomeScreen ("home")

Glavni početni ekran aplikacije.
Sadrži App Bar sa nazivom aplikacije i logo u središtu ekrana.
Ispod loga nalaze se četiri dugmeta koja vode do funkcionalnosti:
    - Pregled filmova

    - Filmski kviz

    - Igra "Pogodi film"

    - Informacije o aplikaciji

### 2.2. MojiFilmoviHome ("moji_filmovi_home")

Prikazuje sve filmove iz baze podataka.
Svaki film ima karticu sa sljedećim informacijama:

    - Naziv filma

    - Lična ocjena

    - Godina

    - Žanr

U TopBar-u pored naziva aplikacije nalazi se “+” dugme koje vodi na ekran za dodavanje novog filma.

### 2.3. AddMovieScreen ("dodaj_film")

Ekran za dodavanje novog filma u bazu.
Sadrži input polja za:
    - Naziv filma

    - Žanr

    - Godinu

    - Ocjenu

### 2.4. MovieQuizScreen ("quiz")

    - Ekran za filmski kviz.
    - U kartici se generiše random pitanje sa četiri ponuđena odgovora.
    - Kviz ima 10 pitanja
    - Gornji lijevi ugao prikazuje trenutni broj pitanja
    - Dugme "Skip" preskače pitanje
    - Ispod kartice prikazuje se ukupni rezultat

    - Bodovanje:
            - Tačan odgovor: +5 bodova
            - Pogrešan odgovor: −3 boda
            - Preskakanje: −2 boda

### 2.5. GameScreen ("guess_movie")

Igra “Pogodi film” – korisnik pokušava prepoznati naziv filma od nasumično izmiješanih slova.
Na ekranu se prikazuje izmiješan naziv filma
Gornji lijevi ugao prikazuje broj trenutnog pitanja
Ima 10 filmova ukupno.

- Dugmad:

    - Submit–potvrđuje odgovor

    - Skip – preskače pitanje

### 2.6. ResultScreen ("result/{score}/{gameType}")

Prikazuje rezultat nakon završene igre ("Pogodi film" ili kviza).
Kartica prikazuje rezultat i tri dugmeta:
Restart – ponovo pokreće igru
Share – dijeli rezultat
Quit – vraća korisnika na početni ekran

### 2.7. AboutScreen ("app_info")

Prikazuje informacije o aplikaciji – njenu svrhu, pravila igara i način korištenja.
 U svim TopBarovima, osim na početnom ekranu, nalazi se strelica za nazad koja vodi na prethodni ekran.

## 3. Tehnički opis korištenih komponenti

Aplikacija koristi moderne Android tehnologije i komponente iz Jetpack biblioteke u kombinaciji sa MVVM arhitekturom.

### 3.1. Jetpack Compose

Deklarativni UI framework za kreiranje korisničkog interfejsa.
Koristi komponente poput Scaffold, TopAppBar, LazyColumn, OutlinedTextField, Card, Button, Text, itd.
Svaki ekran je zasebna @Composable funkcija.

### 3.2. Navigation Component

Navigacija se vrši pomoću NavHost i composable ruta.
Korištene su named rute sa argumentima (npr. "result/{score}/{gameType}").
Implementirano sa rememberNavController().

### 3.3. MVVM arhitektura

ViewModel sloj: MojiFilmoviViewModel, MovieQuizViewModel, GuessMovieViewModel
Logika aplikacije, obrada podataka i emitovanje UI stanja pomoću StateFlow.

#### 3.3.1. MovieQuizViewModel
Upravlja stanjem kviza.
Funkcije:

    - startQuiz() – pokreće novi kviz
    - submitAnswer(selectedIndex: Int) – ažurira rezultat
    - skipQuestion() – preskače pitanje (−2 boda)
    - nextQuestion() – prelazi na naredno pitanje
    - getRandomQuestion() – bira random pitanje

#### 3.3.2. GuessMovieViewModel

Upravlja igrom “Pogodi film”.
Funkcije:
    - init – inicijalizuje igru
    - updateUserGuess() – ažurira korisnikov unos
    - skipWord() – preskače riječ (−3 boda)
    - checkUserGuess() – provjerava tačnost (+10 / −5 bodova)
    - resetGame() – resetuje igru
    - shuffleCurrentWord() – miješa slova
    - pickRandomWordAndShuffle() – bira novu riječ
    - updateGameState() – ažurira stanje igre

#### 3.3.3. MojiFilmoviViewModel

Upravlja prikazom i dodavanjem filmova.
Funkcije:

    - init – učitava sve filmove iz baze
    - insertFilm(naziv, zanr, godina, ocjena) – dodaje novi film

### 3.4. Room Database

@Entity – model Movie

@Dao – SQL upiti (MovieDao)

RoomDatabase – klasa MoviesDatabase

### 3.5. Repository Pattern

MoviesRepository apstrahuje izvor podataka
OfflineMoviesRepository povezuje Room bazu sa ostatkom aplikacije

### 3.6. Dependency Injection (ručna implementacija)

MojiFilmoviViewModelFactory – kreira ViewModele

provideMoviesRepository(context) – instancira bazu i repozitorij

### 3.7. Android Intents za dijeljenje rezultata

Korišten Intent.ACTION_SEND za dijeljenje rezultata putem WhatsAppa, Vibera, e-maila itd.

### 3.8. Material 3 Design

Aplikacija koristi Material 3 dizajn.

Komponente: MaterialTheme, TopAppBar, CardDefaults itd.

Tema definiše boje, tipografiju i stilove.

# 4. Uputstvo za korištenje aplikacije

Na početnom ekranu korisnik može izabrati jednu od opcija:

    - Kviz – odgovaraj na pitanja o filmovima i osvajaj bodove
    - Pogodi film – pokušaj pogoditi naziv filma iz izmiješanih slova
    - Moji Filmovi – pregledaj i dodaj vlastite filmove
    - O aplikaciji – saznaj više o aplikaciji

🎯 Kviz

- Tačan odgovor: +5 bodova
- Pogrešan odgovor: −3 boda
- Preskakanje: −2 boda
- Na kraju korisnik vidi ukupan broj bodova i može ih podijeliti.

🎬 Pogodi film

Izmiješana slova poznatog filmskog naslova
- Tačan odgovor: +10 bodova
- Pogrešan odgovor: −5 bodova
- Preskakanje: −3 boda

Na kraju korisnik vidi rezultat i može ga podijeliti.

🎞️ Moji Filmovi

Pregled svih unesenih filmova

Dodavanje novih filmova unosom:

    - Naslova
    - Žanra
    - Godine

Lične ocjene

✅ Autor: Emir Babačić
📚 Predmet: Razvoj mobilnih aplikacija
📱 Aplikacija: Moji Filmovi