# Write your MySQL query statement below
SELECT user_id, ROUND(AVG(if(C.action="confirmed",1,0)),2) AS confirmation_rate FROM Signups S LEFT JOIN Confirmations C USING(user_id) GROUP BY user_id;