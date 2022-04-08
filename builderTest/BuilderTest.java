package builderTest;

public class BuilderTest {
	private int age;
	private String name;
	private String clgName;
	private boolean isMale;

	private BuilderTest(Builder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.clgName = builder.clgName;
		this.isMale = builder.isMale;
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "BuilderTest [age=" + age + ", name=" + name + ", clgName=" + clgName + ", isMale=" + isMale + "]";
	}



	public static final class Builder {
		private int age;
		private String name;
		private String clgName;
		private boolean isMale;
//
//		Builder() {
//		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withClgName(String clgName) {
			this.clgName = clgName;
			return this;
		}

		public Builder withIsMale(boolean isMale) {
			this.isMale = isMale;
			return this;
		}

		public BuilderTest build() {
			return new BuilderTest(this);
		}
	}
}


