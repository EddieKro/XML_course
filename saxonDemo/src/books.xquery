<query>{
    for $b in doc("books.xml")/catalog/book
    where $b/author="Ivanov"
    order by $b/title descending
    return
    <book>{$b/author}{$b/title}</book>
    }
</query>