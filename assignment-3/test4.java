class Author
{
    String name, email;
    char gender;

    Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }

    String getName()
    {
        return name;
    }

    String getEmail()
    {
        return email;
    }

    char getGender()
    {
        return gender;
    }
}

class Book
{
    String name;
    Author author;
    double price;
    int qty;

    Book(String n, Author a, double p, int q)
    {
        name = n;
        author = a;
        price = p;
        qty = q;
    }

    String getName()
    {
        return name;
    }

    String getAuthor()
    {
        return author;
    }