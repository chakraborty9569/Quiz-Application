create database QuizApplication_Questions
use QuizApplication_Questions

create table QuestionsStore (Question varchar(1000), Option1 varchar(100), Option2 varchar(100), Option3 varchar(100), Option4 varchar(100), CorrectOption int)

select * from QuestionsStore

insert into QuestionsStore values('Which is the only English club to have won English Quadruple?', 'Liverpool', 'Manchester City', 'Chelsea', 'Manchester United', 2)
