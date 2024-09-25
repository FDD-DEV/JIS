-- Inserción de los temas para Ciencias Naturales
INSERT INTO jis_training.topics (topic_name) VALUES ('Ciencias Naturales - Tema 1: Biología');
INSERT INTO jis_training.topics (topic_name) VALUES ('Ciencias Naturales - Tema 2: Física');
INSERT INTO jis_training.topics (topic_name) VALUES ('Ciencias Naturales - Tema 3: Química');

-- Inserción de preguntas y respuestas para Tema 1: Biología
INSERT INTO jis_training.questions (question_text, topic_id) VALUES 
('¿Cuál es la célula principal del sistema nervioso?', 1),
('¿Cuál es la función principal de la fotosíntesis?', 1),
('¿Qué órgano es responsable de bombear sangre por todo el cuerpo?', 1),
('¿Qué tipo de tejido conecta los músculos con los huesos?', 1),
('¿Qué gas es esencial para la respiración de los seres vivos?', 1),
('¿Cuál es el reino al que pertenecen las plantas?', 1),
('¿Qué tipo de reproducción involucra un solo progenitor?', 1),
('¿Qué estructura en la célula contiene el material genético?', 1),
('¿Qué grupo de animales pone huevos?', 1),
('¿Cuál es el proceso de eliminación de desechos en el cuerpo humano?', 1),
('¿Qué glándula produce insulina en el cuerpo humano?', 1),
('¿Cuál es el grupo sanguíneo universal donante?', 1),
('¿Qué parte del ojo es responsable de la percepción de la luz?', 1),
('¿Qué hueso es el más largo del cuerpo humano?', 1),
('¿Qué órgano filtra las toxinas de la sangre?', 1),
('¿Cuál es el nombre del proceso por el cual las plantas pierden agua?', 1),
('¿Qué estructura del oído es responsable del equilibrio?', 1),
('¿Qué tipo de animal es un anfibio?', 1),
('¿Qué grupo de vertebrados tiene plumas?', 1),
('¿Cómo se llama el proceso de transformación de una oruga en mariposa?', 1);

-- Respuestas para Tema 1: Biología
-- Pregunta 1
INSERT INTO jis_training.answers (question_id, answer_text, is_correct, explanation) VALUES 
(1, 'Neurona', true, 'Las neuronas son las células principales del sistema nervioso.'), 
(1, 'Glóbulo rojo', false, 'Los glóbulos rojos transportan oxígeno en la sangre.'),
(1, 'Plaqueta', false, 'Las plaquetas ayudan en la coagulación de la sangre.'),
(1, 'Fibra muscular', false, 'Las fibras musculares forman parte del tejido muscular.'),
(1, 'Célula epitelial', false, 'Las células epiteliales recubren superficies y cavidades.');

-- Pregunta 2
INSERT INTO jis_training.answers (question_id, answer_text, is_correct, explanation) VALUES 
(2, 'Convertir luz en energía química', true, 'La fotosíntesis convierte la luz solar en energía química en forma de glucosa.'),
(2, 'Respirar', false, 'Respirar es un proceso de intercambio de gases, no de conversión de luz.'),
(2, 'Producir dióxido de carbono', false, 'La fotosíntesis consume dióxido de carbono y produce oxígeno.'),
(2, 'Descomponer materia orgánica', false, 'Descomponer materia orgánica es el trabajo de los descomponedores.'),
(2, 'Almacenar agua', false, 'La fotosíntesis no almacena agua, aunque requiere de ella.');

-- Añadir las demás respuestas para las preguntas restantes...
