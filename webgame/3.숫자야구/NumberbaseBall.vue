<template>
    <div>
        <h1>{{resutl}}</h1>
        <form v-on:submi="onSubmitForm">
            <input ref="answer" maxlength="4" v-model="value" />
            <button>입력</button>
        </form>
        <div>시도: {{}}</div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            value: '',
            result: '',
        }
    },
    methods: {
        onSubmitForm(e) {
            e.preventDefault();
            
        }
    }
};
</script>
<style lang="">
    
</style>