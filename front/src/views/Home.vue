<!-- 首页-->
<template>
  <div class="home">
    <Header />
    <h1>Welcome to the Home Page</h1>
    <p>This is the home page of our application.</p>
    <router-link to="/register">Register</router-link>
    <router-link to="/login">Login</router-link>
    <Footer />
  </div>
</template>

<script>
import Header from '@/components/Header.vue';
import Footer from '@/components/Footer.vue';

export default {
  name: 'Home',
  components: {
    Header,
    Footer,
  },
};
</script>

<style scoped>
.home {
  text-align: center;
  padding: 20px;
}
</style>
