public class Main {
    public static void main(String[] args) {
        Author jackLondon = new Author("Джек","Лондон");
        Book whiteFang = new Book(1906,null,jackLondon);
        Author alexandrDuma = new Author(null, "Дюма");
        Book monteCristo = new Book(2012,"Граф Монте-Кристо",alexandrDuma);
        monteCristo.setYearPublication(1845);
        System.out.println(whiteFang);
        System.out.println(alexandrDuma);
        System.out.println(whiteFang.hashCode());
        System.out.println(alexandrDuma.hashCode());
        System.out.println(monteCristo.equals(whiteFang));
        System.out.println(whiteFang.equals(monteCristo));
    }
}