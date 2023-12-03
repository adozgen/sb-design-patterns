package com.adozgen.sbdesignpatterns.prototype.example1;

import lombok.Data;

import java.util.List;

@Data
public class Author implements Prototype<Author>
{
    private String name;
    private List<String> books;

    public Author(String name, List<String> books)
    {
        this.name = name;
        this.books = books;
    }

	@Override
	public Author clone()
	{
        List<String> booksCopy = List.copyOf(books);
		return new Author(this.name, booksCopy);
	}
}
