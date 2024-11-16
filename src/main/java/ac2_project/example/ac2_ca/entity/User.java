package ac2_project.example.ac2_ca.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float nota1;
	private float nota2;
	private float nota3;

    private String username;

    @Embedded
    private User_Email email;

   	// Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User_Email getEmail() {
        return email;
    }

    public void setEmail(User_Email email) {
        this.email = email;
    }
    
    public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	
	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float getNota3() {
		return nota3;
	}

	
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
	public boolean calculaMedia() {

		float media;
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media > 7) {
			
			return true;
		} else {
			
			return false;
		}
	
	}
}