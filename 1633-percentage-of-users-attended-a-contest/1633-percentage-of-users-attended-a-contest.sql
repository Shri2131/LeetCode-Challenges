# Write your MySQL query statement below
SELECT R.contest_id, ROUND(COUNT(DISTINCT R.user_id)*100 / COUNT(DISTINCT U.user_id),2) AS percentage FROM Users U, Register R GROUP BY contest_id ORDER BY percentage DESC, contest_id;