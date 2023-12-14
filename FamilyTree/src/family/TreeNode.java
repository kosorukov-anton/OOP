package family;

import java.io.Serializable;
import java.util.List;

public interface TreeNode<T> extends Serializable {
    void setId(int id);
    int getId();
    Enum getGender();
    void addChild(T human);
    void addParent(T human);
    String getName();
    int getDie();
    int getBirn();
    List<T> getParent();
    List<T> getChild();
    T getPair();
    void setPair(T human);
    String outputHuman();
}