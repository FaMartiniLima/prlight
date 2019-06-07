package rlightpack;


	public class User {
		
		public User(String name, String cpf, int age, String phone, String address) {
			this.name = name;
			this.address = address;
			this.age = age;
			this.cpf = cpf;
			this.phone = phone;
					
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private String name;
		private String cpf;
		private Integer age;
		private String phone;
		private String address;
	}


