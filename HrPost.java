package ldxy.bn.entity;

public class HrPost {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_post.id
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_post.post_id
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    private String post_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_post.post_name
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    private String post_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_post.dept_id
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    private HrDept hr_dept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_post.post_status
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    private Integer post_status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getPost_name() {
		return post_name;
	}

	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}

	public HrDept getHr_dept() {
		return hr_dept;
	}

	public void setHr_dept(HrDept hr_dept) {
		this.hr_dept = hr_dept;
	}

	public Integer getPost_status() {
		return post_status;
	}

	public void setPost_status(Integer post_status) {
		this.post_status = post_status;
	}

	@Override
	public String toString() {
		return "HrPost [id=" + id + ", post_id=" + post_id + ", post_name=" + post_name + ", hr_dept=" + hr_dept
				+ ", post_status=" + post_status + "]";
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_post.id
     *
     * @return the value of hr_post.id
     *
     * @mbg.generated Wed Nov 28 21:15:53 CST 2018
     */
    
}