package com.example.android.ajp_1.utils

import com.example.android.ajp_1.entity.MovieEntity
import com.example.android.ajp_1.entity.TvShowEntity

object DataDummy {
    fun generateDummyMovie(): List<MovieEntity>{
        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity("m1",
            "A Star Is Born",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/mnDvPokXpvsdPcWSjNRPhiiLOKu.jpg",
            "A country music star whose career is starting to fade, Jackson Maine (Bradley Cooper) discovers a very talented talent in a young musician named Ally (Lady Gaga). Maine managed to orbit Ally into a promising young star. But the two of them are involved in a relationship that goes beyond just mentors and students. As Ally and himself skyrocketed, Maine ran into a dilemma regarding this matter." ,
            "05/10/2018 (US)",
            " Drama, Percintaan, Musik ",
            "2h 16m ",
            7.5,
            "Bradley Cooper",
            "https://youtu.be/ykCu1himOK8",
            "https://www.themoviedb.org/movie/332562-a-star-is-born")
        )
        movie.add(
            MovieEntity("m2",
            "Alita: Battle Angle (2019)",
            "https://image.tmdb.org/t/p/w220_and_h330_face/xRWht48C2V8XNfzvPehyClOvDni.jpg",
            "https://image.tmdb.org/t/p/w533_and_h300_bestv2/8RKBHHRqOMOLh5qW3sS6TSFTd8h.jpg",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "14/02/2019 (US)",
                "Aksi, CeritaFiksi, Petualangan",
                "2h sm",
                7.1,
            "Robert Rodriguez",
            "https://youtu.be/w7pYhpJaJW8",
            "https://www.themoviedb.org/movie/399579-alita-battle-angel")
        )
        movie.add(
            MovieEntity("m3",
            "Aquaman(2018)",
            "https://image.tmdb.org/t/p/w220_and_h330_face/ydUpl3QkVUCHCq1VWvo2rW4Sf7y.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/9QusGjxcYvfPD1THg6oW3RLeNn7.jpg",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            " 21/12/2018 (US) ",
            "Aksi, Petualangan, Fantasi",
            "2h 24m",
            6.9,
            "James Wan",
                "https://youtu.be/WDkg3h8PCVU",
            "https://www.themoviedb.org/movie/297802-aquaman")
        )
        movie.add(
            MovieEntity("m4",
            " Bohemian Rhapsody (2018) ",
            "https://image.tmdb.org/t/p/w220_and_h330_face/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
            "https://image.tmdb.org/t/p/w533_and_h300_bestv2/93xA62uLd5CwMOAs37eQ7vPc1iV.jpg",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "02/11/2018 (US)",
            " Drama, Musik ",
            "2h 15m",
            8.0,
            "Anthony McCarten",
            "https://youtu.be/mP0VHJYFOAU",
            "https://www.themoviedb.org/movie/424694-bohemian-rhapsody")
        )
        movie.add(
            MovieEntity("m5",
                "Cold Pursuit (2019)",
                "https://image.tmdb.org/t/p/w220_and_h330_face/cO802woIgZsLbOWPUSsleobKyDp.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/aiM3XxYE2JvW1vJ4AC6cI1RjAoT.jpg",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "08/02/2019 (US) ",
                " Aksi, Kejahatan, Cerita Seru ",
                "1h 59m",
                5.6,
                "Hans Petter Moland",
                "https://youtu.be/0phuNQQ_gHI",
            "https://www.themoviedb.org/movie/438650-cold-pursuit")
        )
        movie.add(
            MovieEntity("m6",
                " Creed II (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/qPQFWrLoQYyGxmeBgmpX901Q0mF.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/9il7qNbeYnPMYlutsVYDsj4hRyb.jpg",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "21/11/2018 (US) ",
                "Drama",
                "2h 10m",
                6.9,
                "Sylvester Stallone",
            "https://youtu.be/u22BXhMu4tI",
            "https://www.themoviedb.org/movie/480530-creed-ii")
        )
        movie.add(
            MovieEntity("m7",
                " Hewan Fantastis: Kejahatan Grindelwald (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/uyJgTzAsp3Za2TaPiZt2yaKYRIR.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/qrtRKRzoNkf5vemO9tJ2Y4DrHxQ.jpg",
                "Gellert Grindelwald telah melarikan diri dari penjara dan telah mulai mengumpulkan pengikut ke tujuannya — meninggikan penyihir di atas semua makhluk non-magis. Satu-satunya yang bisa menghentikannya adalah penyihir yang pernah disebutnya sebagai sahabat terdekatnya, Albus Dumbledore. Namun, Dumbledore akan perlu mencari bantuan dari penyihir yang telah menggagalkan Grindelwald sebelumnya, mantan muridnya, Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis-garis digambar saat cinta dan kesetiaan diuji, bahkan di antara teman-teman dan keluarga sejati, di dunia sihir yang semakin terbagi.",
                "16/11/2018 (US)",
                " Petualangan, Fantasi, Drama ",
                "2h",
                6.9,
                "David Yates",
            "https://youtu.be/8bYBOVWLNIs",
            "https://www.themoviedb.org/movie/338952-fantastic-beasts-the-crimes-of-grindelwald")
        )
        movie.add(
            MovieEntity("m8",
                "Glass (2019)",
                "https://image.tmdb.org/t/p/w220_and_h330_face/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/ngBFDOsx13sFXiMweDoL54XYknR.jpg",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "18/01/2019 (US) ",
                "Drama, Fantasi",
                "2h 9m",
                6.6,
                "M. Night Shyamalan",
            "https://youtu.be/95ghQs5AmNk",
            "https://www.themoviedb.org/movie/450465-glass")
        )
        movie.add(
            MovieEntity("m9",
                " How to Train Your Dragon: The Hidden World (2019)",
                "https://image.tmdb.org/t/p/w220_and_h330_face/bCYRgsT0Kndh23a6kHazBdXWCn1.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/h3KN24PrOheHVYs9ypuOIdFBEpX.jpg",
                "When Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless' discovery of an untested and elusive partner drives Night Fury away. As the danger rises in the house and Hiccup's reign as village chief is put to the test, both the dragon and the rider must make the impossible decision to save their kind.",
                "22/02/2019 (US) ",
                "Animation, family, Adventure",
                "1h 44m",
                7.8,
                "Dean DeBlois",
            "https://youtu.be/XlDRFRaH9hI",
            "https://www.themoviedb.org/movie/166428-how-to-train-your-dragon-3")
        )

        movie.add(
            MovieEntity("m10",
                " Avengers: Infinity War (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/lmZFxXgJE3vgrciwuDib0N8CfQo.jpg",
                "As the Avengers and their allies continue to protect the world from threats too big for a single hero to handle, a new danger has emerged from the cosmic shadow: Thanos. An intergalactic blasphemy despot, his goal is to collect all six Infinity Stones, an unimaginable power artifact, and use them to inflict a twisted will on all realities. Everything the Avengers have fought for has evolved to date - the fate of Earth and existence itself has never been more certain.",
                "27/04/2018 (US) ",
                "Adventure, Action, Fantasi",
                "2h 29m",
                8.3,
                "Joe Russo",
            "https://youtu.be/6ZfuNTqbHE8",
            "https://www.themoviedb.org/movie/299536-avengers-infinity-war")
        )
        movie.add(
            MovieEntity("m11",
                " Mary Queen of Scots (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/b5RMzLAyq5QW6GtN9sIeAEMLlBI.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/iv5N169nQIzrS0pZ8MBEiemTtVt.jpg",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "21/12/2018 (US",
                "Drama, History",
                "2h 4m",
                6.6,
                "Josie Rourke",
            "https://youtu.be/riSROsdT-f0",
            "https://www.themoviedb.org/movie/457136-mary-queen-of-scots")
        )
        movie.add(
            MovieEntity("m12",
                " Master Z: Ip Man Legacy (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/7S0rXJPS15mZMWQieiRUf7WuReX.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/grtVFGJ4ts0nDAPpc1JWbBoVKTu.jpg",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "26/12/2018 (TW) ",
                "Action",
                "1h 27m",
                5.6,
                "Yuen Woo-ping",
            "https://youtu.be/KZau4zsOtyM",
            "https://www.themoviedb.org/movie/450001-cheung-tin-chi")
        )
        movie.add(
            MovieEntity("m13",
                " Mortal Engines (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/rm2oMykm5nX6SzXFr7TGHkO6r8Z.jpg",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "14/12/2018 (US) ",
                "Advanture, Fantasi",
                "2h 9m",
                6.1,
                "Christian Rivers",
            "https://youtu.be/IRsFc2gguEg",
            "https://www.themoviedb.org/movie/428078-mortal-engines")
        )

        movie.add(
            MovieEntity("m15",
                " Wreck-It Ralph (2012) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/j8M1kHBAXa6KFNzGnWtdsVsLUro.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/1LbX3KV6qv6NoH4zKLGM7Sgtwmg.jpg",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                " 02/11/2012 (US) ",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                7.3,
                "Rich Moore",
            "https://youtu.be/87E6N7ToCxs",
            "https://www.themoviedb.org/movie/82690-wreck-it-ralph")
        )
        movie.add(
            MovieEntity("m16",
                " Robin Hood (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/zSJT1sKGRKcmP4I9b8dIOuepw6I.jpg",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "21/11/2018 (US) ",
                "Adventure, Action",
                "1h 56m",
                5.9,
                "Ben Chandler",
            "https://youtu.be/zwPn9ZnbCo0",
            "https://www.themoviedb.org/movie/375588-robin-hood-origins")
        )
        movie.add(
            MovieEntity("m17",
                " Serenity (2019) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/ridcUDnFumpMB5AAsIvFafTSx5i.jpg",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                " 25/01/2019 (US) ",
                "Mistery, Drama",
                "1h 42m",
                5.4,
                "Steven Knight",
            "https://youtu.be/k3zMlsEK8xA",
            "https://www.themoviedb.org/movie/452832-serenity")
        )
        movie.add(
            MovieEntity("m18",
                " Spider-Man (2002) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/gh4cZbhZxyTbgxQPxD0dOudNPTn.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/no2cllXSRA56LPipQnuPlg3RuTL.jpg",
                "After being bitten by a genetically altered spider, nerdy high school student Peter Parker is endowed with amazing powers to become the Amazing superhero known as Spider-Man.",
                " 22/05/2002 (ID)",
                "Fantation, Action",
                "2h 1m",
                7.2,
                "Sam Raimi",
            "https://youtu.be/Ozz8uxW733Q",
            "https://www.themoviedb.org/movie/557-spider-man")
        )
        movie.add(
            MovieEntity("m19",
                " T-34 (2018) ",
                "https://image.tmdb.org/t/p/w220_and_h330_face/dA6mPgdFMA03MjerpnndYytyKdT.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/3QVSM3DYxvov57j25vxDNJGHUpQ.jpg",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                " 01/01/2019 (RU) ",
                "Criminal, Action, Drama, History",
                "2h 19m",
                6.7,
                "Alexey Sidorov",
                 "https://youtu.be/a5A7QboG8Nk",
            "https://www.themoviedb.org/movie/505954-34")
        )

        return movie
    }
    fun generateDummyTvShow(): List<TvShowEntity>{
        val tvShow= ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity("t1",
            " The Arrow (2012) ",
            "Arrows is a retelling of the adventures of the legendary DC hero Green Arrow" ,
            "https://image.tmdb.org/t/p/w220_and_h330_face/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg",
            6.5,
            "https://image.tmdb.org/t/p/w533_and_h300_bestv2/fFT7T9y9NVRdcdVh81roVrJBcDh.jpg",
            "Criminal, Drama, Misteri, Action and Adventure",
            "42m",
            "https://www.themoviedb.org/tv/1412-arrow")
        )
        tvShow.add(
            TvShowEntity("t2",
                " Doom Patrol (2019) ",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg",
                7.5,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/rqHL4HsLCix9H6vhCwAuSOge0NS.jpg",
                "Sci-fi$ Fantasy, Action and Adventure",
                "49m",
            "https://www.themoviedb.org/tv/79501-doom-patrol")
        )
        tvShow.add(
            TvShowEntity("t3",
                " Dragon Ball Super (2015) ",
                "With Majin Boo defeated half-a-year prior, peace returns to Earth, where Son Goku (now a radish farmer) and his friends now live peaceful lives. However, a new threat appears in the form of Beerus, the God of Destruction. Considered the most terrifying being in the entire universe, Beerus is eager to fight the legendary warrior seen in a prophecy foretold decades ago known as the Super Saiyan God. The series retells the events from the two Dragon Ball Z films, Battle of Gods and Resurrection 'F' before proceeding to an original story about the exploration of alternate universes.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/9gzkpjs6N7Xxo1CnnJqhFtmYCez.jpg",
                8.1,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/yJAOi2n0VYBEXdPI1NXv5FiOcBX.jpg",
                "Animation, Mistery, Action, Adventure",
                "24m",
            "https://www.themoviedb.org/tv/62715-dragon-ball-chou")
        )
        tvShow.add(
            TvShowEntity("t4",
                " Family Guy (1999) ",
                "The sick, twisted and wrong animated animated series Freakin 'Sweet, features the adventures of the dysfunctional Griffin family. Clumsy Peter and long-suffering Lois have three children. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and most unpopular girl in town) and Chris (middle child, she is not very smart but has a passion for movies). The last member of the family is Brian - a talking dog and more than just a pet, he looks after Stewie, while sipping Martinis and sorting out his own life problems." ,
                "https://image.tmdb.org/t/p/w220_and_h330_face/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg",
                6.9,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/4oE4vT4q0AD2cX3wcMBVzCsME8G.jpg",
                "Animation, comedy",
                "22m",
            "https://www.themoviedb.org/tv/1434-family-guy")
        )
        tvShow.add(
            TvShowEntity("t5",
                "The Flash(2014)",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Several months later he awakens with the power of superhuman speed, giving him the ability to move through Central City like an invisible guardian angel. Although initially delighted by his new powers, Barry is surprised to find that he is not the only \"meta-human\" created after the accelerator explosion - and not everyone is using their new powers for good. Barry partnered with S.T.A.R. Lab and dedicate his life to protecting the innocent. To date, only a few close friends and associates know that Barry is literally the fastest human being, but it won't be long before the world finds out what Barry Allen is all about.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                7.5,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/z59kJfcElR9eHO9rJbWp4qWMuee.jpg",
                "Drama, Sci-fi, Fantasy",
                "44m",
            "https://www.themoviedb.org/tv/60735-the-flash")
        )
        tvShow.add(
            TvShowEntity("t7",
                " Gotham (2014) ",
                "Everyone knows Commissioner Gordon's name. He was one of the world's greatest enemies of crime, a man whose reputation was synonymous with law and order. But what is known about Gordon's story and his rise from novice detective to Police Commissioner? What does it take to navigate the various layers of corruption that surreptitiously rule Gotham City, the home of the world's most iconic criminals? And what circumstances created them - the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "https://image.tmdb.org/t/p/w220_and_h330_face/5tSHzkJ1HBnyGdcpr6wSyw7jYnJ.jpg",
                7.4,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/97GsCX3k6BbprnBIIMlVKirmhLz.jpg",
                "Drama, Fantasy, Criminal",
                "43m",
            "https://www.themoviedb.org/tv/60708-gotham")
        )
        tvShow.add(
            TvShowEntity("t8",
                " Grey's Anatomy (2005) ",
                "Follow the personal and professional lives of a group of doctors at the Gray Sloan Memorial Hospital in Seattle",
                "https://image.tmdb.org/t/p/w220_and_h330_face/jnsvc7gCKocXnrTXF6p03cICTWb.jpg",
                8.0,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/3IIBf6VlwEyKAX4cN2XCM1gKdgM.jpg",
                "Drama",
                "43m",
            "https://www.themoviedb.org/tv/1416-grey-s-anatomy")
        )
        tvShow.add(
            TvShowEntity("t9",
                " Hanna (2019) ",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg",
                7.4,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/6Fzyuwn8KeMCSqRILfdrDmCvmod.jpg",
                "Action, Adventure, Drama",
                "50m",
            "https://www.themoviedb.org/tv/54155-hanna")
        )
        tvShow.add(
            TvShowEntity("t10",
                " Fairy Tail: Dragon Cry (2017) ",
                "Natsu Dragneel and his friends travel to the island Kingdom of Stella, where they will reveal dark secrets, fight the new enemies and once again save the world from destruction.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/rTNk0cZ0CnTp7EMndtaJVLUUffh.jpg",
                6.5,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/s1eUjN5hLpez9QoBK8t4rUoopgN.jpg",
                "Action Adventure, Comedy, Fantasi, Animasi",
                "1h 25m",
            "https://www.themoviedb.org/tv/38811-dragon-crisis")
        )
        tvShow.add(
            TvShowEntity("t11",
                " Marvel's Iron Fist (2017) ",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/rioMBKotMSu2lRIpGAaGRiDauAe.jpg",
                6.4,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/xHCfWGlxwbtMeeOnTvxUCZRGnkk.jpg",
                "Action, Adventure, Drama, Sci-fi, Fantasy",
                "55m",
            "https://www.themoviedb.org/tv/62127-marvel-s-iron-fist")
        )
        tvShow.add(
            TvShowEntity("t12",
                " ナルト 疾風伝 (2007) ",
                "Naruto Shippuuden is a continuation of the original Naruto animated TV series. This story revolves around Uzumaki Naruto who is older and a little more mature and his efforts to save his friend Uchiha Sasuke from the clutches of the snake-like Shinobi, Orochimaru. After 2 and a half years, Naruto finally returned to his village of Konoha, and started realizing his ambition, even though it wouldn't be easy, because he had gathered several enemies (more dangerous), such as the shinobi organization. ; Akatsuki.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/hadyAd0I5RDB7QbHwTg5HhlvIfO.jpg",
                8.7,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/y1E6d7x8ZGujIdbf9oiE0hlxtQ3.jpg",
                "Animation, Drama, Comedy",
                "25m",
            "https://www.themoviedb.org/tv/31910-naruto-shipp-den")
        )
        tvShow.add(
            TvShowEntity("t13",
                " NCIS (2003) ",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg",
                7.1,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/4VuCtYBvZGq6Rk3gloigwlsTefE.jpg",
                "Action, Adventure, Criminal, Drama",
                "45m",
            "https://www.themoviedb.org/tv/4614-ncis")
        )
        tvShow.add(
            TvShowEntity("t14",
                " Riverdale (2017) ",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/6zBWSuYW3Ps1nTfeMS8siS4KUaA.jpg",
                8.6,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/9hvhGtcsGhQY58pukw8w55UEUbL.jpg",
                "Drama, Mistery",
                "45m",
            "https://www.themoviedb.org/tv/69050-riverdale")
        )
        tvShow.add(
            TvShowEntity("t15",
                "  Shameless (2011) ",
                " Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/m2gf7SYOq9z30Q1dJFMF51DfrmF.jpg",
                7.9,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/1ccgQ6IJyEc8UHPtGeFFeRqMVnc.jpg",
                "Comedy, Drama",
                "1h",
            "https://www.themoviedb.org/tv/34307-shameless")
        )
        tvShow.add(
            TvShowEntity("t16",
                " Supergirl (2015) ",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg",
                7.1,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/mmprryb2r0X8u9JkZCnaJIzyYX4.jpg",
                "Actio, Adventure, Drama, Fiksi",
                "42m",
            "https://www.themoviedb.org/tv/62688-supergirl")
        )
        tvShow.add(
            TvShowEntity("t17",
                " Supernatural (2005)" ,
                "The two brothers search for their missing father, the man who trains them to become warriors against supernatural evil",
                "https://image.tmdb.org/t/p/w220_and_h330_face/iLtWzaK2WKxb1YDk3E9VysMRYNA.jpg",
                8.1,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/nVRyd8hlg0ZLxBn9RaI7mUMQLnz.jpg",
                "Drama, Mistery, DSci-fi & Fantasy",
                "45m",
            "https://www.themoviedb.org/tv/1622-supernatural")
        )
        tvShow.add(
            TvShowEntity("t18",
                " The Simpsons (1989) ",
                "Set in Springfield, America's average city, this show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as thousands of virtual players. Since its inception, the series has become a pop culture icon, drawing hundreds of celebrities to guest appearances. The show has also become known for its fearless satire of political life, the media and America in general",
                "https://image.tmdb.org/t/p/w220_and_h330_face/qcr9bBY6MVeLzriKCmJOv1562uY.jpg",
                7.7,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/adZ9ldSlkGfLfsHNbh37ZThCcgU.jpg",
                "Animation, Comedy, Family, Drama",
                "22m",
            "https://www.themoviedb.org/tv/456-the-simpsons")
        )
        tvShow.add(
            TvShowEntity("t19",
                " The Umbrella Academy (2019) ",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg",
                8.7,
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/qJxzjUjCpTPvDHldNnlbRC4OqEh.jpg",
                "Action, Adventure, Sci-fi, Fantasy, Comedy, Drama",
                "56m",
            "https://www.themoviedb.org/tv/75006-umbrella-academy")
        )
        tvShow.add(
            TvShowEntity("t20",
                " The Walking Dead: Red Machete (2017) ",
                "Follow the path of the red-handled weapon used by Rick Grimes to kill Terminus leader Gareth; from its innocent beginnings on a hardware store shelf at the start of the apocalypse into the hands of various survivors, familiar and new.",
                "https://image.tmdb.org/t/p/w220_and_h330_face/m6f6KQQtG6Jjvo3OK2Pd0K6ay5y.jpg",
                1.5,
                "https://image.tmdb.org/t/p/w220_and_h330_face/m6f6KQQtG6Jjvo3OK2Pd0K6ay5y.jpg",
                "",
                "",
            "https://www.themoviedb.org/tv/104720-the-walking-dead-red-machete")
        )
        return tvShow
    }
}