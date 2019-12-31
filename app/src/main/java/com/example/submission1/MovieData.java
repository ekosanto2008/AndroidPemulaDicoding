package com.example.submission1;

import java.util.ArrayList;

class MovieData {

    private static String[] movieTitle = {
            "Ad Astra",
            "Star Wars: The Rise of Skywalker",
            "Ip Man 4: The Finale",
            "Jumanji: The Next Level",
            "Joker",
            "Zombieland: Double Tap",
            "Frozen II",
            "Avengers: Infinity War",
            "6 Underground",
            "Gundala",
    };

    private static String[] movieOverview = {
            "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission across the immensity of space and its many perils to uncover the truth about a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.",
            "The surviving Resistance faces the First Order once again as the journey of Rey, Finn and Poe Dameron continues. With the power and knowledge of generations behind them, the final battle begins.",
            "Ip Man 4 is an upcoming Hong Kong biographical martial arts film directed by Wilson Yip and produced by Raymond Wong. It is the fourth in the Ip Man film series based on the life of the Wing Chun grandmaster of the same name and features Donnie Yen reprising the role. The film began production in April 2018 and ended in July the same year.",
            "As the gang return to Jumanji to rescue one of their own, they discover that nothing is as they expect. The players will have to brave parts unknown and unexplored in order to escape the world’s most dangerous game.",
            "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
            "Columbus, Tallahassee, Wichita, and Little Rock move to the American heartland as they face off against evolved zombies, fellow survivors, and the growing pains of the snarky makeshift family.",
            "Elsa, Anna, Kristoff and Olaf head far into the forest to learn the truth about an ancient mystery of their kingdom.",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "After faking his death, a tech billionaire recruits a team of international operatives for a bold and bloody mission to take down a brutal dictator.",
            "Sancaka has lived on the streets since his parents left him. Living a hard life, Sancaka survives by thinking about his own safety. When the condition of the city gets worse and injustice rages throughout the country, Sancaka must decide whether he continues to live to look after himself or rise to become their oppressed hero.",
    };

    private static int[] movieImage = {
            R.drawable.adastra,
            R.drawable.starwars,
            R.drawable.ipman,
            R.drawable.jumanji,
            R.drawable.joker,
            R.drawable.zombieland,
            R.drawable.frozen2,
            R.drawable.avengers,
            R.drawable.underground,
            R.drawable.gundala
    };

    static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < movieTitle.length; position++){
            Movie movie =  new Movie();
            movie.setTitle(movieTitle[position]);
            movie.setOverview(movieOverview[position]);
            movie.setPhoto(movieImage[position]);
            list.add(movie);
        }
        return list;
    }
}
