public class Main {
    public static void main(String[] args) {
        Author jackLondon = new Author("Джек","Лондон");
        Book whiteFang = new Book(1906,"Белый клык",jackLondon);
        Author alexandrDuma = new Author("Александр", "Дюма");
        Book monteCristo = new Book(2012,"Граф Монте-Кристо",alexandrDuma);
        monteCristo.setYearPublication(1845);
    }
}