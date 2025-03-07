SELECT animal_type, COUNT(animal_type)
FROM animal_ins
WHERE animal_type = 'Cat'
OR animal_type = "Dog"
Group By animal_type
Order By animal_type;
