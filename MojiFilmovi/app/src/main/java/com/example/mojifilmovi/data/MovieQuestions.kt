package com.example.mojifilmovi.data

class MovieQuestion (
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

val MovieQuestions = listOf(
    MovieQuestion(
        question = "Ko je režirao film 'Inception'?",
        options = listOf("Christopher Nolan", "Steven Spielberg", "James Cameron", "Quentin Tarantino"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "U kojem filmu glumi robot po imenu WALL-E?",
        options = listOf("Up", "Finding Nemo", "WALL-E", "Toy Story"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koji film je osvojio Oscar za najbolji film 1994. godine?",
        options = listOf("Pulp Fiction", "Forrest Gump", "The Shawshank Redemption", "Four Weddings and a Funeral"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Kako se zove glavni lik u filmu 'The Matrix'?",
        options = listOf("Neo", "Morpheus", "Trinity", "Agent Smith"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koji je prvi film iz Marvel Cinematic Universe (MCU)?",
        options = listOf("Iron Man", "The Incredible Hulk", "Captain America", "Thor"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "U kojem filmu se pojavljuje lik po imenu Jack Sparrow?",
        options = listOf("Pirates of the Caribbean", "Hook", "Peter Pan", "Treasure Island"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi Batmana u trilogiji 'The Dark Knight'?",
        options = listOf("Ben Affleck", "Christian Bale", "Robert Pattinson", "Michael Keaton"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koji film ima rečenicu 'May the Force be with you'?",
        options = listOf("Star Trek", "Guardians of the Galaxy", "Star Wars", "Dune"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko je režirao film 'Pulp Fiction'?",
        options = listOf("Martin Scorsese", "Quentin Tarantino", "Steven Soderbergh", "Francis Ford Coppola"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "U kojem filmu se pojavljuje čudovište po imenu Godzilla?",
        options = listOf("King Kong", "Pacific Rim", "Godzilla", "Cloverfield"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koji animirani film je o lavi po imenu Simba?",
        options = listOf("The Lion King", "Madagascar", "Zootopia", "Kung Fu Panda"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Kako se zove vila u filmu 'Peter Pan'?",
        options = listOf("Bell", "Stella", "Tinker Bell", "Daisy"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi Iron Mana u Marvel filmovima?",
        options = listOf("Chris Evans", "Robert Downey Jr.", "Mark Ruffalo", "Tom Holland"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koji film je poznat po rečenici 'I'm the king of the world!'?",
        options = listOf("Gladiator", "Titanic", "Braveheart", "The Revenant"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koja čudovišta se bore u filmu 'Godzilla vs. Kong'?",
        options = listOf("Godzilla i Kong", "King Kong i Mothra", "Godzilla i Mechagodzilla", "Kong i T-Rex"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koji je film o čovjeku koji ostane zarobljen na Marsu?",
        options = listOf("Gravity", "Interstellar", "The Martian", "Ad Astra"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko je režirao 'The Grand Budapest Hotel'?",
        options = listOf("Wes Anderson", "David Fincher", "Tim Burton", "Paul Thomas Anderson"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "U kojem filmu se pojavljuje lik po imenu Frodo?",
        options = listOf("Harry Potter", "The Hobbit", "The Lord of the Rings", "Narnia"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koja glumica igra glavnu ulogu u filmu 'La La Land'?",
        options = listOf("Emma Watson", "Emma Stone", "Anne Hathaway", "Scarlett Johansson"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Kako se zove čarobnjak u 'Harry Potter' serijalu?",
        options = listOf("Frodo", "Gandalf", "Dumbledore", "Merlin"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko je glavna uloga u filmu 'Wolf ot the Wall Street'?",
        options = listOf("Leonardo di Caprio", "Brad Pitt", "Denzel Washington", "Zac Efron"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je glavna ženska uloga u filmu 'Wolf ot the Wall Street'?",
        options = listOf("Margott Robbie", "Megan Fox", "Emma Watson", "Gal Gadot"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Titanic'?",
        options = listOf("Leonardo DiCaprio", "Brad Pitt", "Johnny Depp", "Matt Damon"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi Iron Mana u Marvel filmovima?",
        options = listOf("Chris Hemsworth", "Robert Downey Jr.", "Chris Evans", "Mark Ruffalo"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi Harryja Pottera u filmskom serijalu?",
        options = listOf("Elijah Wood", "Rupert Grint", "Daniel Radcliffe", "Tom Holland"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi Jokera u filmu 'Joker' iz 2019. godine?",
        options = listOf("Heath Ledger", "Jared Leto", "Joaquin Phoenix", "Christian Bale"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi ulogu Neo-a u filmu 'The Matrix'?",
        options = listOf("Keanu Reeves", "Tom Cruise", "Brad Pitt", "Leonardo DiCaprio"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Forrest Gump'?",
        options = listOf("Tom Hanks", "Robin Williams", "Matt Damon", "Jim Carrey"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi Batmana u trilogiji Christophera Nolana?",
        options = listOf("Ben Affleck", "Michael Keaton", "Christian Bale", "Robert Pattinson"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u 'La La Land'?",
        options = listOf("Emma Watson", "Jennifer Lawrence", "Scarlett Johansson", "Emma Stone"),
        correctAnswerIndex = 3
    ),
    MovieQuestion(
        question = "Ko glumi Thora u Marvelovim filmovima?",
        options = listOf("Chris Pratt", "Chris Hemsworth", "Liam Hemsworth", "Henry Cavill"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'The Revenant'?",
        options = listOf("Leonardo DiCaprio", "Tom Hardy", "Matt Damon", "Jake Gyllenhaal"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi Spider-Mana u filmu 'Spider-Man: No Way Home'?",
        options = listOf("Tobey Maguire", "Andrew Garfield", "Tom Holland", "Chris Evans"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'Pretty Woman'?",
        options = listOf("Julia Roberts", "Meg Ryan", "Sandra Bullock", "Cameron Diaz"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi Kapetana Ameriku u Marvelovim filmovima?",
        options = listOf("Chris Pratt", "Chris Hemsworth", "Chris Evans", "Tom Holland"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Mission: Impossible'?",
        options = listOf("Tom Cruise", "Matt Damon", "Keanu Reeves", "Bruce Willis"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'The Hunger Games'?",
        options = listOf("Emma Stone", "Jennifer Lawrence", "Emma Watson", "Kristen Stewart"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Gladiator'?",
        options = listOf("Mel Gibson", "Russell Crowe", "Gerard Butler", "Sean Bean"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Deadpool'?",
        options = listOf("Ryan Gosling", "Ryan Reynolds", "Chris Evans", "Jake Gyllenhaal"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Inception'?",
        options = listOf("Joseph Gordon-Levitt", "Tom Hardy", "Leonardo DiCaprio", "Cillian Murphy"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'Black Widow'?",
        options = listOf("Elizabeth Olsen", "Scarlett Johansson", "Brie Larson", "Zoe Saldana"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi Dartha Vadera u originalnoj trilogiji 'Star Wars' (glas)?",
        options = listOf("David Prowse", "Mark Hamill", "James Earl Jones", "Harrison Ford"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'The Wolf of Wall Street'?",
        options = listOf("Jonah Hill", "Brad Pitt", "Leonardo DiCaprio", "Matthew McConaughey"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'The Devil Wears Prada'?",
        options = listOf("Meryl Streep", "Sandra Bullock", "Anne Hathaway", "Natalie Portman"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi Shreka u originalnoj verziji (glas)?",
        options = listOf("Eddie Murphy", "Mike Myers", "Tom Hanks", "Billy Crystal"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Cast Away'?",
        options = listOf("Tom Hanks", "Matt Damon", "Kevin Costner", "Robin Williams"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'Gravity'?",
        options = listOf("Natalie Portman", "Anne Hathaway", "Sandra Bullock", "Emma Watson"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi Sherlocka Holmesa u filmovima Guyja Ritchieja?",
        options = listOf("Benedict Cumberbatch", "Hugh Laurie", "Robert Downey Jr.", "Johnny Depp"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Interstellar'?",
        options = listOf("Leonardo DiCaprio", "Christian Bale", "Matthew McConaughey", "Brad Pitt"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi Froda u trilogiji 'Gospodar prstenova'?",
        options = listOf("Elijah Wood", "Daniel Radcliffe", "Rupert Grint", "Tobey Maguire"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'The Truman Show'?",
        options = listOf("Tom Hanks", "Robin Williams", "Jim Carrey", "Will Ferrell"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko glumi glavnu žensku ulogu u filmu 'Notting Hill'?",
        options = listOf("Julia Roberts", "Kate Winslet", "Sandra Bullock", "Drew Barrymore"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Titanic'?",
        options = listOf("1995", "1997", "1999", "2001"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Inception'?",
        options = listOf("2008", "2009", "2010", "2011"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Dark Knight'?",
        options = listOf("2006", "2008", "2010", "2012"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Godfather'?",
        options = listOf("1970", "1972", "1974", "1976"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Pulp Fiction'?",
        options = listOf("1992", "1994", "1996", "1998"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Matrix'?",
        options = listOf("1997", "1998", "1999", "2000"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Forrest Gump'?",
        options = listOf("1992", "1994", "1996", "1998"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Lord of the Rings: The Fellowship of the Ring'?",
        options = listOf("2000", "2001", "2002", "2003"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Gladiator'?",
        options = listOf("1999", "2000", "2001", "2002"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Avatar'?",
        options = listOf("2007", "2008", "2009", "2010"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Joker' sa Joaquin Phoenixom?",
        options = listOf("2017", "2018", "2019", "2020"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'La La Land'?",
        options = listOf("2015", "2016", "2017", "2018"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Interstellar'?",
        options = listOf("2012", "2013", "2014", "2015"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Avengers'?",
        options = listOf("2010", "2011", "2012", "2013"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Frozen'?",
        options = listOf("2011", "2012", "2013", "2014"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Social Network'?",
        options = listOf("2008", "2009", "2010", "2011"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Whiplash'?",
        options = listOf("2013", "2014", "2015", "2016"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'The Grand Budapest Hotel'?",
        options = listOf("2012", "2013", "2014", "2015"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Parasite'?",
        options = listOf("2017", "2018", "2019", "2020"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koje godine je izašao film 'Dune' (Denis Villeneuve)?",
        options = listOf("2019", "2020", "2021", "2022"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolji film 2020. godine?",
        options = listOf("Joker", "1917", "Once Upon a Time in Hollywood", "Parasite"),
        correctAnswerIndex = 3
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najboljeg glumca 2020. godine?",
        options = listOf("Joaquin Phoenix", "Leonardo DiCaprio", "Adam Driver", "Antonio Banderas"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolju glumicu 2019. godine?",
        options = listOf("Lady Gaga", "Olivia Colman", "Glenn Close", "Melissa McCarthy"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolji film 2015. godine?",
        options = listOf("Birdman", "Boyhood", "The Imitation Game", "American Sniper"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najboljeg glumca 2016. godine?",
        options = listOf("Leonardo DiCaprio", "Matt Damon", "Eddie Redmayne", "Michael Fassbender"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolji film 2017. godine?",
        options = listOf("La La Land", "Moonlight", "Arrival", "Lion"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najboljeg reditelja 2020. godine?",
        options = listOf("Sam Mendes", "Quentin Tarantino", "Bong Joon-ho", "Martin Scorsese"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolju glumicu 2021. godine?",
        options = listOf("Frances McDormand", "Carey Mulligan", "Viola Davis", "Andra Day"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolji film 2022. godine?",
        options = listOf("CODA", "Belfast", "Dune", "The Power of the Dog"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko je osvojio Oscara za najbolji film 2023. godine?",
        options = listOf("Everything Everywhere All At Once", "The Banshees of Inisherin", "Top Gun: Maverick", "Elvis"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koji film ima poznatu rečenicu: 'May the Force be with you'?",
        options = listOf("The Matrix", "Star Wars", "Star Trek", "Avatar"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koji film je režirao Christopher Nolan 2023. godine?",
        options = listOf("Tenet", "Dunkirk", "Interstellar", "Oppenheimer"),
        correctAnswerIndex = 3
    ),
    MovieQuestion(
        question = "Koji film je baziran na priči o ratu između robota i ljudi?",
        options = listOf("The Matrix", "I, Robot", "Ex Machina", "Terminator"),
        correctAnswerIndex = 3
    ),
    MovieQuestion(
        question = "Koji animirani film ima pjesmu 'Let It Go'?",
        options = listOf("Frozen", "Tangled", "Moana", "Brave"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'John Wick'?",
        options = listOf("Jason Statham", "Keanu Reeves", "Tom Hardy", "Liam Neeson"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Kako se zove svemirski brod u filmu 'Alien' (1979)?",
        options = listOf("Enterprise", "Discovery", "Nostromo", "Prometheus"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koji film iz 1997. je dobio 11 Oscara?",
        options = listOf("Titanic", "L.A. Confidential", "Good Will Hunting", "The Full Monty"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "U kojem filmu iz 1990-ih se pojavljuje rečenica 'You can't handle the truth!'?",
        options = listOf("Heat", "A Few Good Men", "Se7en", "Fight Club"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Ko glumi serijskog ubicu u filmu 'Se7en' (1995)?",
        options = listOf("Kevin Spacey", "Brad Pitt", "Morgan Freeman", "Gary Oldman"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koji je glavni glumac u filmu 'The Truman Show' (1998)?",
        options = listOf("Tom Hanks", "Jim Carrey", "Robin Williams", "Ben Stiller"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koji film iz 1999. godine je poznat po rečenici 'I see dead people'?",
        options = listOf("The Sixth Sense", "The Others", "The Blair Witch Project", "Scream"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Kako se zove film iz 1991. u kojem se pojavljuje lik Hannibala Lectera?",
        options = listOf("Se7en", "The Silence of the Lambs", "Misery", "Cape Fear"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koji glumac glumi ulogu T-800 u filmu 'Terminator 2: Judgment Day' (1991)?",
        options = listOf("Arnold Schwarzenegger", "Sylvester Stallone", "Bruce Willis", "Jean-Claude Van Damme"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Ko glumi glavnu ulogu u filmu 'Pretty Woman' (1990)?",
        options = listOf("Julia Roberts", "Meg Ryan", "Sandra Bullock", "Cameron Diaz"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "U kojem filmu Tom Hanks glumi odvjetnika koji boluje od AIDS-a?",
        options = listOf("Cast Away", "Saving Private Ryan", "Philadelphia", "Apollo 13"),
        correctAnswerIndex = 2
    ),
    MovieQuestion(
        question = "Koji film iz 1999. je režirao David Fincher i postao kultni klasik?",
        options = listOf("Fight Club", "American Beauty", "The Matrix", "Magnolia"),
        correctAnswerIndex = 0
    ),
    MovieQuestion(
        question = "Koji film iz 1994. prati zatvorenika Andyja Dufresnea?",
        options = listOf("Shutter Island", "The Shawshank Redemption", "Green Mile", "American History X"),
        correctAnswerIndex = 1
    ),
    MovieQuestion(
        question = "Koja komedija iz 1994. uključuje likove Harry i Lloyd?",
        options = listOf("Dumb and Dumber", "Wayne's World", "Ace Ventura", "The Mask"),
        correctAnswerIndex = 0
    )
)