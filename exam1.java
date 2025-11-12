public class exam1 {
    public static void main(String[] args) {
        // Tableau des villes
        String[] tab_ville = {
            "Le Caire", "New York", "Paris", "Calcutta",
            "Barcelone", "Manille", "Montréal", "Hong Kong"
        };

        // Tableau des superficies (km²)
        double[] tab_superficie = {
            210, 1214, 105.4, 185,
            100.4, 38.55, 363.52, 1104
        };

        // Tableau des populations (habitants)
        int[] tab_population = {
            8452409, 8391881, 2211297, 4580544,
            1621537, 1660714, 1667700, 7018636
        };

        // Tableau des densités (hab/km²)
        double[] tab_densite = new double[tab_ville.length];

        // Calcul des densités
        for (int i = 0; i < tab_ville.length; i++) {
            tab_densite[i] = tab_population[i] / tab_superficie[i];
        }

        // Affichage des résultats
        System.out.println("Ville\t\tSuperficie (km²)\tPopulation\t\tDensité (hab/km²)");
        for (int i = 0; i < tab_ville.length; i++) {
            System.out.printf("%-10s\t%-15.2f\t%-12d\t%-10.2f\n",
                tab_ville[i], tab_superficie[i], tab_population[i], tab_densite[i]);
        }
    } 

}    
