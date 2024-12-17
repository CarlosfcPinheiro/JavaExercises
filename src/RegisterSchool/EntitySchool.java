package RegisterSchool;

public abstract class EntitySchool implements Identifiable{
    private final String id;
    private final String name;

    public EntitySchool(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

}
