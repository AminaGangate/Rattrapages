package mooc;

import java.util.*;

public class Platform {

    private final List<Course> myCourse = new LinkedList<>();
    private HashMap<Integer, Person> myStudent;

    public Platform() {
    }

    /**
     * Ajoute un cours à la liste de cours dispensés
     *
     * @param c le cours à ajouter (non null)
     */
    public void addCourse(Course c) {
        if (null == c) {
            throw new IllegalArgumentException("course is null");
        }
        myCourse.add(c);
    }

    /**
     * @return les étudiants inscrits à l'université
     */
    public Set<Person> students() {
        Set<Person> result = new HashSet<>();

        for (Person p : myStudent) {
            result.add(p);
        }
        return result;
    }

    /**
     * @return les cours dispensés par l'université
     */
    public Set<Course> courses() {
        Set<Course> result = new HashSet<>();

        myCourse.forEach(c -> {
            result.add(c.getCourse());
        });
        return result;
    }
}

/**
 * Inscrire un étudiant à l'université
 *
 * @param s l'étudiant à inscrire (non null)
 */
public void registerStudent(Person s) {
		if (null == s) {
			throw new IllegalArgumentException("Student is not register");
		}
      myStudent.add(s);

        
	}

	/**
	 * Inscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 */
	public void enroll(Person s, Course c) throws Exception {
	if (registerStudent == null ) {
        throw new IllegalArgumentException ("Student is not register");
        }
        
        Enroll e = new Enroll(s, c);
        s.add(e);
        c.add(e);
	}

	/**
	 * Désinscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws Exception si l'étudiant a déjà une note àce cours
	 */
	public void withdraw(Person s, Course c) throws Exception {
		if(enroll(myStudent)!=null) {
                student.remove(myStudent);
                }
                else {
                System.out.println("Student not found!");
                 }
    }
	/**
	 * Donner une note à un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @param  mark la note
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université,
	 * ou si l'étudiant a déjà une note pour ce cours
	 */
	public void setMark(Person s, Course c, int mark) throws Exception {
		if (null == mark) {
		throw new IllegalArgumentException("mark is null");
                 this.mark = mark;
        }
        else {
        return mark;
        }
	}

	/**
	 * Connaitre la note d'un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @return la note de l'étudiant pour le cours
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 * ou si l'étudiant n'a pas encore de note à ce cours
	 */
	public int getMark(Person s, Course c) throws Exception {
		
	}

	/**
	 * @param c le cours considéré
	 * @return les étudiants inscrits à ce cours
	 * @throws Exception si le cours n'est pas dispensé par l'université
	 */
	public Set<Person> studentsForCourse(Course c) throws Exception {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @param s l'étudiant considéré
	 * @return les cours auxquels un étudiant est incrit
	 * @throws Exception si l'étudiant n'est pas inscrit à l'université, 
	 */
	public Set<Course> coursesForStudent(Person s) throws Exception {

        }

	/**
	 * @return les cours auxquels aucun étudiant n'est incrit
	 */
	public Set<Course> emptyCourses() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
