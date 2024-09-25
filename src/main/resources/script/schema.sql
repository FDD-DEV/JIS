-- Crear un esquema llamado 'jis_training'
CREATE SCHEMA jis_training;

-- Tabla para almacenar los temas dentro del esquema 'jis_training'
CREATE TABLE jis_training.topics (
    id bigint primary key generated always as identity,
    topic_name text not null
);

COMMENT ON TABLE jis_training.topics IS 'Tabla para almacenar los temas';
COMMENT ON COLUMN jis_training.topics.id IS 'Identificador único del tema';
COMMENT ON COLUMN jis_training.topics.topic_name IS 'Nombre del tema';

-- Tabla para almacenar las preguntas dentro del esquema 'jis_training'
CREATE TABLE jis_training.questions (
    id bigint primary key generated always as identity,
    question_text text not null,
    topic_id bigint references jis_training.topics(id)
);

COMMENT ON TABLE jis_training.questions IS 'Tabla para almacenar las preguntas';
COMMENT ON COLUMN jis_training.questions.id IS 'Identificador único de la pregunta';
COMMENT ON COLUMN jis_training.questions.question_text IS 'Texto de la pregunta';
COMMENT ON COLUMN jis_training.questions.topic_id IS 'Referencia al tema al que pertenece la pregunta';

-- Tabla para almacenar las respuestas dentro del esquema 'jis_training'
CREATE TABLE jis_training.answers (
    id bigint primary key generated always as identity,
    question_id bigint references jis_training.questions(id) on delete cascade,
    answer_text text not null,
    is_correct boolean not null,
    explanation text
);

COMMENT ON TABLE jis_training.answers IS 'Tabla para almacenar las respuestas';
COMMENT ON COLUMN jis_training.answers.id IS 'Identificador único de la respuesta';
COMMENT ON COLUMN jis_training.answers.question_id IS 'Referencia a la pregunta correspondiente';
COMMENT ON COLUMN jis_training.answers.answer_text IS 'Texto de la respuesta';
COMMENT ON COLUMN jis_training.answers.is_correct IS 'Indica si la respuesta es correcta';
COMMENT ON COLUMN jis_training.answers.explanation IS 'Explicación de por qué la respuesta es correcta (si aplica)';