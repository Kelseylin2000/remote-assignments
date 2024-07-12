use assignment;

SELECT a.article_id, a.author_id, a.title, a.content, u.email
FROM article a
INNER JOIN user u ON a.author_id = u.id;

SELECT *
FROM article
ORDER BY  article_id
LIMIT 6 OFFSET 6;