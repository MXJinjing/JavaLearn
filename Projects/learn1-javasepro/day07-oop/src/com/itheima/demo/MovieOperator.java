package com.itheima.demo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printALlMovies(){
        System.out.println("--------系统的全部电影如下--------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号："+ m.getId());
            System.out.println("名称："+ m.getName());
            System.out.println("价格："+ m.getPrice());
            System.out.println("-----------------------------");
        }
    }

    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("该电影详情如下：");
                System.out.println("编号："+ m.getId());
                System.out.println("名称："+ m.getName());
                System.out.println("价格："+ m.getPrice());
                System.out.println("得分："+ m.getScore());
                System.out.println("导演："+ m.getDirector());
                System.out.println("主演："+ m.getActor());
                System.out.println("其他："+ m.getInfo());
            }
        }
    }
}
