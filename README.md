🎬 Moji Filmovi

Autor: Emir Babačić
Indeks: 199/IT-20
Predmet: Razvoj mobilnih aplikacija

📱 Opis aplikacije

Moji Filmovi je Android aplikacija namijenjena ljubiteljima filmova, izrađena pomoću Jetpack Compose i MVVM arhitekture.
Aplikacija omogućava korisnicima da:

    - vode vlastitu kolekciju filmova (unos, pregled i ocjenjivanje),

    - učestvuju u filmskom kvizu s dinamičnim pitanjima i sistemom bodovanja,

    - igraju igru “Pogodi film” prepoznajući naslove iz izmiješanih slova,

    - dijele svoj rezultat putem drugih aplikacija,

    - pročitaju informacije o načinu korištenja aplikacije.

🧭 Navigacija i struktura

Navigacija je implementirana pomoću Jetpack Navigation Compose.
Glavni ekrani aplikacije su:

    - HomeScreen – početni ekran s izborom funkcionalnosti

    - MojiFilmoviHome i AddMovieScreen – pregled i unos filmova

    - MovieQuizScreen – ekran za filmski kviz

    - GameScreen – igra “Pogodi film”

    - ResultScreen – prikaz i dijeljenje rezultata

    - AboutScreen – informacije o aplikaciji

⚙️ Tehnologije i arhitektura

Aplikacija koristi:

    - Jetpack Compose – za moderan i deklarativan UI

    - Room Database – za lokalno čuvanje unesenih filmova

    - StateFlow i ViewModel – za upravljanje stanjima ekrana

    - Repository pattern – za odvajanje izvora podataka

    - Material 3 Design – za konzistentan vizualni identitet

🧩 Ključne funkcionalnosti

🎞️ Dodavanje i čuvanje filmova u lokalnoj bazi

🎯 Filmski kviz s bodovanjem (+5, −3, −2)

🎬 Igra “Pogodi film” s bodovanjem (+10, −5, −3)

📤 Dijeljenje rezultata pomoću Intent.ACTION_SEND

📘 Dodatno

Za detaljan tehnički opis i strukturu projekta pogledati dokumentaciju projekta u fajlu "dokumentacija".


