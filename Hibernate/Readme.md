@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)

orphanRemoval - remove elements without relation
CascadeType - action type which influence related entities