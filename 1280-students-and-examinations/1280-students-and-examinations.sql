# Write your MySQL query statement below
SELECT stud.student_id, stud.student_name, subs.subject_name, COUNT(exams.student_id) AS attended_exams
FROM Students AS stud
CROSS JOIN Subjects as subs
LEFT JOIN Examinations as exams
ON stud.student_id = exams.student_id AND subs.subject_name = exams.subject_name
Group BY stud.student_id,stud.student_name,subs.subject_name
ORDER BY stud.student_id, subs.subject_name; 

