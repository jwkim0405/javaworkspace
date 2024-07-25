package test06_delete_method;
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    // 각각의 자식 클래스에서 
    // eat()은 그대로 물려받아 사용하고 있지만
    // speak()는 부모 클래스에서 쓰이지 않음.
    
    @Override
    public void speak() {
        System.out.println("고양이가 말합니다: 야옹");
    }
}