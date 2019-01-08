package com.example.kon.myapplication

import android.content.Context
import android.graphics.BitmapFactory

class LangCollection(val ctx: Context) {

    fun getList(): ArrayList<LangItem> {
        var listLang = ArrayList<LangItem>()
        listLang.add(LangItem(
                name = "Java",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.java),
                site = "https://java.com",
                year = 1972,
                author = "Dennis Ritchie & Bell Labs"
        ))
        listLang.add(LangItem(
                name = "C",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.c),
                site = "https://en.wikipedia.org/wiki/C_(programming_language)"
        ))
        listLang.add(LangItem(
                name = "Python",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.python),
                site = "https://www.python.org/",
                author = "Guido van Rossum"
        ))
        listLang.add(LangItem(
                name = "C++",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.cpp),
                site = "https://isocpp.org/",
                author = "Bjarne Stroustrup",
                year = 1985
        ))
        listLang.add(LangItem(
                name = "C++",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.vbnet),
                site = "https://docs.microsoft.com/dotnet/visual-basic/",
                author = "Microsoft",
                year = 2001
        ))
        listLang.add(LangItem(
                name = "Visual Basic.NET",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.vbnet),
                site = "https://isocpp.org/",
                author = "Bjarne Stroustrup",
                year = 1985
        ))
        listLang.add(LangItem(
                name = "JavaScript",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.js),
                site = "https://developer.mozilla.org/en-US/docs/Web/JavaScript",
                author = "Brendan Eich",
                year = 1995,
                paradigm = "event-driven,[1] functional, imperative, object-oriented (prototype-based)"
        ))
        listLang.add(LangItem(
                name = "C#",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.cs),
                site = "https://docs.microsoft.com/dotnet/csharp/language-reference/",
                author = "Microsoft",
                year = 2000,
                paradigm = "Structured, imperative, object-oriented, event-driven, task-driven, functional, generic, reflective, concurrent"
        ))
        listLang.add(LangItem(
                name = "PHP",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.java),
                site = "https://secure.php.net/",
                author = "Rasmus Lerdorf",
                year = 1995,
                paradigm = "Imperative, functional, object-oriented, procedural, reflective"
        ))
        listLang.add(LangItem(
                name = "SQL",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.sql),
                site = "https://en.wikipedia.org/wiki/SQL",
                author = "Donald D. Chamberlin, Raymond F. Boyce",
                year = 1974,
                paradigm = "Multi-paradigm: declarative"
        ))
        listLang.add(LangItem(
                name = "Objective-c",
                logo = BitmapFactory.decodeResource(ctx.resources, R.drawable.oc),
                site = "https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/Introduction/Introduction.html",
                author = "Tom Love and Brad Cox",
                year = 1984,
                paradigm = "Reflective, class-based object-oriented"
        ))
        return listLang
    }
}