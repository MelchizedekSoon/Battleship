
abstract class BaseEntity {
    protected long id;

    protected long version;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getVersion() {
        return this.version;
    }
}

class User extends BaseEntity {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Visit extends BaseEntity {

    protected User user;

    protected WebSite site;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }
}

class WebSite extends BaseEntity {

    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
